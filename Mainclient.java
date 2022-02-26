package com.dkh.coreerentreturntype;

public class Mainclient {

	public static void main(String[] args) {
		//AA a=new AA();
		AA a= new BB();
		//BB a = new BB();
		System.out.println(a.x);
		Object test = a.test();
		System.out.println(test);
		AA.print();

	}
}
