package com.e.dk;

public class MyTread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println("Using runable way thread print:" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {
		MyTread t = new MyTread();
		Thread th = new Thread(t);
		th.start();
		// t.run(); two time print karega

		// OBJECT OF ANOTHER THREAD USING EXTENDS

		NewTrhead nt = new NewTrhead();

		nt.start();
	}

}
