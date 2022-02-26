package DemonThread.e.dk;

public class Company {

	int n;
	boolean b = false;

	// f=false : chance to procduce
	// f=true : chance to consume.
	synchronized public void Procude_items(int n) throws InterruptedException {

		if (b) {
			wait();
		}
		this.n = n;
		System.out.println("produce items " + this.n);
		b = true;
		notify();
	}

	synchronized public int comsume_items() throws InterruptedException {
		if (!b) {
			wait();
		}
		System.out.println("consumed items :" + this.n);

		b = false;
		notify();
		return this.n;

	}

}
