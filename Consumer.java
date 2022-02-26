package DemonThread.e.dk;

public class Consumer extends Thread {
	Company com;

	public Consumer(Company com) {
		this.com = com;

		System.out.println("consumer contstror:");

	}

	public void run() {
		while (true) {
			try {
				this.com.comsume_items();
			} catch (InterruptedException e1) {
				
				e1.printStackTrace();
			}
			try {
				Thread.sleep(300);

			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}
}
