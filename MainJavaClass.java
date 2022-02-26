package DemonThread.e.dk;

public class MainJavaClass {
	public static void main(String[] args) {

		Company comp = new Company();
		Procuced p = new Procuced(comp);
		Consumer c = new Consumer(comp);
		p.start();
		c.start();
	}

	public MainJavaClass() { 
		System.out.println("Main class constructor");
	}
}
