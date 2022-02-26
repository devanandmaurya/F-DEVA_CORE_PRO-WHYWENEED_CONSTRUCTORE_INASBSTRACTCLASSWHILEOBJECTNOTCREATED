package com.dkh.abstracts;

public class Canweoverridemainmethodinjavayess {
	public static void main(String [] args) {
		System.out.println("main mehtod are called first!!S");
		
		
		System.out.println("********************");
		main("devanand");
		System.out.println("**********************");

		main(" ak maurya", 12);
	}

	// overloaded methode
	public static void main(String name) {
		System.out.println(name);

	}

	// number of parameter difference of overloaded method
	public static void main(String name, int age) {
		System.out.println(name);
		System.out.println(age);
	}
}
