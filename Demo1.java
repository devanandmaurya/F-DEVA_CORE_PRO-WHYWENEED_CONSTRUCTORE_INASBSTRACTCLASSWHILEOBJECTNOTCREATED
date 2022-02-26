package com.dkh.abstracts;

public abstract class Demo1 {
	int i, j;

	public Demo1(int i, int j) {
		this.i = i;
		this.j = j;
		System.out.println("i am abstract class provide only planing");
	}
}
/*
 * java abstract class and interface When we know the specification but not
 * aware for implementation then we should go for INTERFACE.
 * 
 * WHEN WE KNOW THE PARTIAL IMPLEMTNION THEN WE SHOULD GO FOR ABSTRACT CLASS
 * BECAUSE IT HAVE ABSTRACT AND CONTCRETE METHOD.
 * 
 * the interface key word use in the interface create and THE ABSTRACT KEYWORD
 * It USED TO CREATE THE ABSTRACTE CLASS.
 * 
 * THE VARIABLE OF ABSTRACT CLASS CAN HAVE FINAL NON FINAL NON STATIC WHEREAS IN
 * interface variable must be public static final so===============
 * 
 * we can achieve multiple inheritance by using interface Where as with an
 * abstract class it is not possible as multiple inheritance is not supported by
 * java
 * 
 * an interface can not have constructor because its variable is static final
 * and final and when we declare then we must initialized it while A ABSTRACT
 * CLASS HAVE CONSTRUCTOR BECUASE HERE WE DECLEARED VARIBLE AND MAKE CONSTRUCTR
 * TO CALL THESE ITS EXTEDEDS CLASS AS REUSBILTY USING SUPER KEYWORD
 * 
 * 
 * BELLOW JAVA 8 INFERFACE HAVE ABSTRACT MEHOD ON ABOVE WE HAVE ABSTRACT DEFAULT
 * AND STATIC METHOD THAT IS BOTH CONCRETE AND ABSTRACT METHOD
 * 
 * WHILE ABSTRACT CLASS HAVE BOTHE ABSTRACT AND CONCCRETE METHOD AB BAT AATI HAI
 * DONO KE PASS ABSTRACT AND CONCRETE METHOD HAI TO KISE USE KARE
 * 
 * YAHA ANS HOGA IFTERFACE MULTIPLE INHERITENCE SUPPORT KAREGA JAHA REEQURED HO
 * AESA VHA USE KARO LEKIN ABSTRACT CLASS NHI KAREGA
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */