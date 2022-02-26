package com.e.dk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class TREVERSeXA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("devanand Maurya");
		list.add("ajay");
		list.add("soni ");
		// list.add(1, "vijay ");
		System.out.println(list);

		for (String string : list) {
			System.out.println(string + "\t " + string.length() + "\t");

			StringBuffer br = new StringBuffer(string);
			System.out.println("the reverse list is:" + br.reverse());
		}
		System.out.println("__________________________________Iterater________");

		// forword traverse
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			String st = itr.next();
			System.out.println(st);
		}
		// backword travers //ke liye list me size() mehtod pass karna hoga he
		System.out.println("______________list etretor backword k liye__________");
		ListIterator<String> ls = list.listIterator(list.size());
		while (ls.hasPrevious()) {
			String string = (String) ls.previous();
			System.out.println(string);

		}
		System.out.println("_____________________By lamda traverse_________");
		list.forEach(a -> {
			System.out.println("by lamda output " + a);

		});

		System.out.println("______________By tree set_______");
		TreeSet<String> t = new TreeSet<>();
		t.addAll(list);
		t.forEach(e -> {
			System.out.println(e);
		});
	}
}
