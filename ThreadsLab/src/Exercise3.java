
public class Exercise3 {

	public static Object lock1 = new Object();

	public static Object lock2 = new Object();

	public static void main(String[] args) {
		
		ThreadOne threadOne = new ThreadOne();
		ThreadTwo threadTwo = new ThreadTwo();
		threadOne.start();
		threadTwo.start();
	}
	

	/**
	 * Thread one with locks
	 * @author udara.s
	 *
	 */
	static class ThreadOne extends Thread {

		@Override
		public void run() {

			System.out.println("Started Executing Thread 1");

			synchronized (lock1) {

				System.out.println("Thread 1 holding lock 1....");

				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				System.out.println("Thread 1 is awaiting for the lock2");

				synchronized (lock2) {

					System.out.println("Thread 1 is holding lock 1 & lock 2");

				}
			}
		}
	}

	/**
	 * Thread 2 with two locks
	 * @author udara.s
	 *
	 */
	static class ThreadTwo extends Thread {

		@Override
		public void run() {

			System.out.println("Started Executing Thread 2");

			synchronized (lock1) {

				System.out.println("Thread 2 holding lock 2....");

				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				System.out.println("Thread 2 is awaiting for the lock1");

				synchronized (lock2) {

					System.out.println("Thread 2 is holding lock 1 & lock 2");

				}
			}
		}
	}

}
