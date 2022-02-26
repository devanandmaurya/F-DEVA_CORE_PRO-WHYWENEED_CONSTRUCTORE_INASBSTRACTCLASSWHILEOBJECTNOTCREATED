package com.e.dk;

import java.util.HashMap;

public class Hasmapexa {
	public static void main(String[] args) {

		HashMap<Integer, String> m = new HashMap<>();
		m.put(1000, "Core java fee");
		m.put(2000, "advance  java fee");
		m.put(3000, "Spring  fee");
		m.put(4000, "hibernate fee");
		System.out.println(m);
		m.forEach((This_is_key, This_is_value) -> {
			System.out.println(This_is_key);
			System.out.println("-->>");
			System.out.println(This_is_value);

		});

		System.out.println("_____________________________");
		// for map ko travers k liye foreach entryset keyset method hai

		// how to know 1000 fee for which subject

		System.out.println("To key fee of 1000 k is::" + m.get(1000));
	}
}
