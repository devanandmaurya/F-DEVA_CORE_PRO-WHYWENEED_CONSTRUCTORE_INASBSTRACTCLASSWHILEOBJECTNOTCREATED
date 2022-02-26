package ThreadOperation;

public class ThreadOp {

	public static void main(String[] args) {
		System.out.println("program started..");
		int x = 5 + 9;
		System.out.println("sume is:" + x);

		// IF MAIN THREAD HAI TO PRINT NAME
		// thread
		Thread t = Thread.currentThread();
		// to print by getname method
		String tt = t.getName();
		System.out.println("Current thread running Name : " + tt);
		// Set Name
		t.setName("Mymainthread _main ");
		// to sleep method is static method
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(t.getName());
		System.out.println(t.getId());
		System.out.println(t.getPriority());
		
		
		// GOING TO DEFIND USERDIFIND THREAD START
		userThread ut = new userThread();
		ut.start();
		
		
		System.out.println(t.getClass());
		System.out.println(t.toString());
		System.out.println(t.getStackTrace());

		System.out.println("program end");
	}
}

class userThread extends Thread {
	public void run() {
		System.out.println("run method execute");
	}
}
