package com.dkh.coreerentreturntype;

public class BB extends AA {
public  String x="BB class variable ";

@Override
public String test(){
return "BB class test method return ";	
}
public static String print() {
	return "The static method from b class can not be overridden";
}
}
