package DemonThread.e.dk;

public class Procuced extends Thread {

	Company c;

	public Procuced(Company c) {
		this.c = c;

	}

	public void run() {
		int i = 1;
		while (true) {
			try {
				this.c.Procude_items(i);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {

				Thread.sleep(400);
			} catch (Exception e) {
				e.printStackTrace();
			}

			i++;

		}
	}
}
