package com.e.dk;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.Vector;

public class LearnCollection {

	public static void main(String[] args) {
		System.out.println("Welome to collection");

		// new ArrayList();
		// TYPE SAFE COLLECTION THAT IS GENERIC default size is 10 and growable in nature
		//dynamic groth
		// ORDER IS PRESERVE THAT IS JIS ORDER ME DALA USE ORDER ME PRINT HOGA

		ArrayList<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("devanand Maurya");
		list.set(2, "Anita");
		list.add(1, "vijay ");
		// list.add(123); due to genirc type safe only string support
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		list.remove(1);
		System.out.println(list);
		System.out.println(list.size());

		// it check items is there or not //so TYPE KA EQUAL METHOD CALLL KARTA HAI
		// CONTAINS METHOD
		System.out.println(list.contains("A"));

		System.out.println("****************By usig nonsafe list*************");

		List l = new ArrayList();
		l.add(1);
		l.add("devanand");
		l.add(12.0);
		l.add(2l);
		l.add(true);
		// ii l.remove(arg0);
		System.out.println(l.contains(1));
		System.out.println("the update data of list" + l);

		
		Vector<String>v=new Vector<>();
		v.addAll(l);
		System.out.println("vector element"+l);
		
		
		System.out.println("++++++++hasset++++++++++++");
		HashSet<Double>hs=new HashSet<>();
		hs.add(12.54);
		hs.add((double) 122);//DOUBLICATE NOT ALLOW
		hs.add((double) 122);
		hs.add((double) 5l);
		
		
		System.out.println("**********TREE SET**************");
		
		TreeSet<String>t=new TreeSet<>();  //ASENDING ORDER DATA SET
		t.add("C");
		t.add("B");
		t.add("D");
		t.add("A");
		t.add("A");//dublicate are not allows
		System.out.println(t);
		
		System.out.println("hashset data::"+hs.hashCode());
		
	}

}
