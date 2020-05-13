
public class Exercise2 {

	public static void main(String[] args) {

		Object lock1 = new Object();
		Object lock2 = new Object();

		Thread1 thread1 = new Thread1(lock1, lock2);
		Thread2 thread2 = new Thread2(lock1, lock2);
		thread1.start();
		thread2.start();
	}
}

/**
 * Thread one with locks
 * 
 * @author udara.s
 *
 */
class Thread1 extends Thread {

	Object lock1;

	Object lock2;

	public Thread1(Object lock1, Object lock2) {
		this.lock1 = lock1;
		this.lock2 = lock2;
	}

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
 * 
 * @author udara.s
 *
 */
class Thread2 extends Thread {

	Object lock1;

	Object lock2;

	public Thread2(Object lock1, Object lock2) {
		this.lock1 = lock1;
		this.lock2 = lock2;
	}

	@Override
	public void run() {

		System.out.println("Started Executing Thread 2");

		synchronized (lock2) {

			System.out.println("Thread 2 holding lock 2....");

			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println("Thread 2 is awaiting for the lock1");

			synchronized (lock1) {

				System.out.println("Thread 2 is holding lock 1 & lock 2");

			}
		}
	}
}
