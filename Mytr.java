package DirectWayTocreateTreat;

public class Mytr implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("i::->"+i);
			System.out.println("i am the :" + Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (Exception e) {

				e.printStackTrace();
				
				
			}
		}

	}

}
