package com.dkh.abstracts;

public class Demo2 extends Demo1 {
	int xx, yy;

	public Demo2(int i, int j, int xx, int yy) {
		// this.i = i;
		// this.j = j;
		// suppos 100 class want to extends abstract class demo1
		// then this.i=i, and this.j=j we don't need to write
		// we just write super class
		super(i, j);
		this.xx = xx;
		this.yy = yy;

	}

}
