package com.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.entity.Studentclass;
import com.st.Dao.StudentDao;

// LEARN VIDEO PROJEC CRASH COURSE BY WITH DURGESH  YOY TUBE
//https://www.youtube.com/playlist?list=PL0zysOflRCenCfUTpsGw9crgOih-VbNoT
public class Student {

	public static void main(String[] args) throws IOException {

		System.out.println("Hello: welcome to you in my apps");
		// FOR WHILE CASE USER INPUT READ LINE USE BELLOW VIA SYSTEM
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println("PRESS 1 TO ADD STUDENT");
			System.out.println("PRESS 2 TO DELETE STUDENT");
			System.out.println("PRESS 3 TO DISPLAY STUDENT");
			System.out.println("PRESS 4 TO UPDATE STUDENT");
			System.out.println("PRESS 5  TO EXIT APPS");
			// TO READ USER INPUT
			int c = Integer.parseInt(br.readLine());

			// ***********add student ********//
			if (c == 1) {
				System.out.println("Enter student name");
				String name = br.readLine();

				System.out.println("Enter student phone");
				String phone = br.readLine();

				System.out.println("Enter student city");
				String city = br.readLine();
				// create Student class object here
				Studentclass st = new Studentclass(name, phone, city);
				boolean ans = StudentDao.insertsudentDb(st);
				/// st here store and studentdoa me recieve karega
				/// (studentclass std)
				if (ans) {
					System.out.println("Student added successfully..");
				} else {
					System.out.println("somthing is wrong please try again..");
				}
				System.out.println("The details of student is " + st);
			}

			// *********** delete student***********//

			else if (c == 2) {

				System.out.println("Enter student id to delete");
				int userid = Integer.parseInt(br.readLine());
				boolean f = StudentDao.deletStudent(userid);
				if (f) {
					System.out.println("The data  of user id basic  delete student record ");

				} else {
					System.out.println("something is wrong !");
				}

				// ************display student that is show all********//

			} else if (c == 3) {
				System.out.println("The all record show");
				StudentDao.showAllstudentdata();

			} else if (c == 4) {

				System.out.println("Enter student name");
				String name = br.readLine();

				System.out.println("Enter student phone");
				String phone = br.readLine();

				System.out.println("Enter student city");
				String city = br.readLine();

				Studentclass st = new Studentclass(name, phone, city);
				boolean b = StudentDao.updatestudent(st);
				if (b == true) {
					System.out.println("update success");
				} else {
					System.out.println("not upudate somthing is wromg..");
				}
			}

			else {
				break;
			}
		}
		System.out.println("Hi thank you  see you again....");
		System.out.println("see you again bye bye...");
	}

}
