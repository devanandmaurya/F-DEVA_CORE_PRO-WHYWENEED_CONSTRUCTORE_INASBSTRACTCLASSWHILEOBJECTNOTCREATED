package com.dkh.abstracts;

public class Demo01Main extends Demo1 {
	int k, l;

	public Demo01Main(int i, int j, int k, int l) {
		// this.i = i;
		// this.j = j;
		// to remove this only we have to write super() and
		// make an constructor in the abstract class
		super(i, j);
		this.k = k;
		this.l = l;

	}

	public static void main(String[] args) {

		Demo01Main d = new Demo01Main(27, 91, 75, 86);
		System.out.println(d.i + " " + d.j + " " + d.k + " " + d.l);
	}
}
