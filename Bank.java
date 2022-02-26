package real.time.exam.interfacejava8.featurs;

public class Bank {
	public static void main(String[] args) {
		
		System.out.println("from rbi to sbi d w >>>>>>>>");
		RBI ubuser = new SBI();
		ubuser.withdraw();
		ubuser.deposit();
		System.out.println("====================================");
		System.out.println("from rbi to PNB d w >>>>>>>>");
		RBI pnb = new PNB();
		pnb.withdraw();
		pnb.deposit();
	    pnb.panlink();
	    pnb.checkmin();
		System.out.println("from rbi to AXIS d w >>>>>>>>");
        RBI ax = new Axis();
		ax.withdraw();
		ax.deposit();
		//ax.checkmin();
		//ax.panlink();
	}
}
