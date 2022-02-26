package real.time.exam.interfacejava8.featurs;

public interface RBI {
	// public abstract void withdraw(); internally
	///public abstract
	void withdraw();
	abstract void deposit();

    public default void checkmin() {
	System.out.println("now u need to mainten min bal 1000");
	}

	public default void panlink() {
		System.out.println("please provide your pan card to the bank");
	}
}

/*
 * interface RBI NEW extends RBI { void checkmin(); void panlink(); }
 */
class SBI implements RBI {
	public void withdraw() {
		System.out.println("sbi money withdrwa method...");
	}
	public void deposit() {
		System.out.println("sbi money deposite method...");
	}
}
class Axis implements RBI {
	public void withdraw() {
		System.out.println("Axis money withdrwa method...");
	}
	public void deposit() {
		System.out.println("Axis money deposite method...");
	}
}

class PNB implements RBI {
	public void withdraw() {
		System.out.println("PBB money withdrwa method...");
	}
	public void deposit() {
		System.out.println("PNB money deposite method...");
	}

	public void panlink() {
		System.out.println("from pnb bank comes default method just link in babk pan card");
	}
	public void checkmin() {
	System.out.println("from pnb bank comes default method just mainten1000k");
	}
}

/*
 * class Sbi to  extends SBI implements RBINEW { public void checkmin() {
 * System.out.println("now u need to mainten min bal 1000"); } public void
 * panlink() { System.out.println("plese provid pan card to your bank"); } }
 */
