package com.dkh.abstracts;

public class EclipsFeatursTest {
	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			findPower(2, i);
		}
	}

	private static void findPower(double number, int i) {
		System.out.println("the value of i is ::" + i);
		double pow = Math.pow(number, i);
		System.out.println(number + "related to " + i + "is ::" + pow);
		System.out.println("***********************end****************");

	}
}
