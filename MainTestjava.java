package Trickyoutput.com.program.overriden;

class A {

	   public A() {
		greeting();
		prints();
	}

	void greeting() {
		System.out.println("instance method from A");
	}

	   static void prints() {
		System.out.println("static method from A");
	}
}

class B extends A {

	public B() {
	//	super();
		// INTERNALLY YHA SUPER() HAI JO PERRANET METHOD KE PASS
		// JAYEGA BUt OVERRIDEN KE BAJE SE YE CHILD KO PRINT kaREGA
		// BUT STATIC METHOD CAN NOT OVRRIDEN SO STATIC VALE A METHOD
		// KO PRINT MAREGA FIR B KO ..

	}

	void greeting() {
		System.out.println("instance method from B");
	}

	static void prints() {
		System.out.println("static method from B");
	}
}


public class MainTestjava {

	public static void main(String[] args) {
		new B(); // in case of B(); out put is ::instance method from B
		// static method from A
		// instance method from B
		// static method from B

		new A();
		// or A a= new A(); to bhe output same hoga
		// in case of A() outputis : instance method from A
		// static method from A

	}

}
