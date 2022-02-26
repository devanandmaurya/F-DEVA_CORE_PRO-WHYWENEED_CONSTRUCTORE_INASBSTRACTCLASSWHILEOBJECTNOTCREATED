package DirectWayTocreateTreat;

public class Mtread {
	public static void main(String[] args) {

		System.out.println("Thread creation in java by main method current thread");
		System.out.println(Thread.currentThread().getName());

		Mytr m = new Mytr();
		Thread t = new Thread(m);
		t.start();

		System.out.println("______________________");
		// ANNONYMOUS CLASS SE THREAD BANANA

		{
			Runnable t2 = new Runnable() {

				@Override
				public void run() {
					// TODO Auto-generated method stub
					System.out.println("I am from annonymous class thread 1::" + Thread.currentThread().getName());
				}
			};
			Thread ttt = new Thread(t2);
			ttt.start();

			System.out.println("____________BY LAMDA MAKES OR CREATE THREAD________");

			Runnable t3 = () -> {
				System.out.println("This is by lamda thread 2" + Thread.currentThread().getName());
			};
			Thread thread = new Thread(t3);
			thread.start();
		}

	}
}
