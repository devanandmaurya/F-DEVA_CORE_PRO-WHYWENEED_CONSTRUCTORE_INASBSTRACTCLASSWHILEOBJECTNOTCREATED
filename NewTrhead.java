package com.e.dk;

public class NewTrhead extends Thread {
@Override
	public void run() {
		for (int i = 10; i > 0; i--) {
			System.out.println("Another thread of extends way:" + i);
		}

		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
