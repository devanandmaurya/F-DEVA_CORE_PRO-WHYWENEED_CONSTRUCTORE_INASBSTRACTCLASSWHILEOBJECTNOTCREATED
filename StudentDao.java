package com.st.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import com.Connection.Myconnection;
import com.entity.Studentclass;

public class StudentDao {

	// *************INSERT DATA INTO DB***************************//

	// here meathod makes static beacuse we not required create object
	// here studentclass recived and std is varible
	public static boolean insertsudentDb(Studentclass std) {
		boolean f = false;
		// jdbc code FOR DB WORK AND CONNECTION

		try {
			// here by class name myconnectionmethod call kiya hai
			Connection con = Myconnection.myConnectionMethod();

			// ab std ka data store karna db me by using bellow query and it is dynamic by
			// prepared smt
			String sql = "insert into student(sname,sphone,scity) value(?,?,?)";
			// prepared statent SE fire dynamic query

			PreparedStatement ps = con.prepareStatement(sql);
			// set the value of parameter and std object varible ka sname sphone scity
			// chaiye
			ps.setString(1, std.getSname());
			ps.setString(2, std.getSphone());
			ps.setString(3, std.getScity());

			// now execute by ps SE DATA DB ME JATA HAI
			ps.executeUpdate();
			f = true;

		} catch (Exception e) {
			e.printStackTrace();

		}
		return f;
	}

	// ***********************DELETE OPERATOIN*****************

	public static boolean deletStudent(int userid) {
		boolean f = false;
		try {
			Connection con = Myconnection.myConnectionMethod();
			String sql = "delete from student where sid=?";
			PreparedStatement ps = con.prepareStatement(sql);
			// set only userid to delete data
			ps.setInt(1, userid);
			// now execute by ps for update
			ps.executeUpdate();
			f = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	// ***********show all data*******************//

	public static boolean showAllstudentdata() {
		boolean f = false;
		try {
			Connection con = Myconnection.myConnectionMethod();
			String sql = "select * from student";
			// for select query we use only create stament not preparedstement
			Statement ps = con.createStatement();
			// for data fetch ke liye executequery use hota abhi agar data nhi
			// lana hota ahi to execute update use hota hai

			// ab resultset ka use karenge data store karvane ke liye result set k form me
			ResultSet rs = ps.executeQuery(sql);
			// ab data nikal kar ek ek row print karna hai
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String phone = rs.getString(3);
				String city = rs.getString("scity");
				System.out.println("student id is:" + id);
				System.out.println("student name is :" + name);
				System.out.println("student phone " + phone);
				System.out.println("student city is:" + city);
				System.out.println("***********Done***********");

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	/// ***************update student data *********************//
	public static boolean updatestudent(Studentclass std) {

		String password = "devanand";
		String username = "123123123";
		String city = "jaipur";

		boolean ff = false;
		try {
			Connection con = Myconnection.myConnectionMethod();
			String st = ("update  student set  sname=?,sphone=? where scity=?");

			// where condition agar where condition jaipur db me match karega to he update
			// hoga.//
			PreparedStatement pts = con.prepareStatement(st);
			pts.setString(1, password);
			pts.setString(2, username);
			pts.setString(3, city);
			int ro = pts.executeUpdate();
			if (ro > 0) {
				System.out.println("Record updated :::" + ro);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("The output of e" + e);
		}

		return ff;

	}

}
