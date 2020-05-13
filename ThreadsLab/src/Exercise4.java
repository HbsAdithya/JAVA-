import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Exercise4 {

	public static Map<String, Integer> number1 = new LinkedHashMap<String, Integer>();

	public static void main(String[] args) {

		T1 t1 = new T1();
		T2 t2 = new T2();
		t1.start();
		t2.start();
	}

	/**
	 * Thread one with locks
	 * 
	 * @author udara.s
	 *
	 */
	static class T1 extends Thread {

		@Override
		public void run() {

			synchronized (number1) {

				int no1, no2;
				System.out.println("\nThread 01 started..");

				Scanner scanner = new Scanner(System.in);

				for (int i = 0; i < 3; i++) {
					
					System.out.println("Please enter no1 and no2 as keyboard Inputs 3 times.");

					System.out.print("Enter no1 : ");

					no1 = scanner.nextInt();

					System.out.print("Enter no2 : ");

					no2 = scanner.nextInt();

					number1.put(no1 + " * " + no2 + " = ", no1 * no2);
				}
				try {
					System.out.println("Thread 01 goes to waiting state");
					number1.wait();
					new T2().start();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * Thread 2 with two locks
	 * 
	 * @author udara.s
	 */
	static class T2 extends Thread {

		@Override
		public void run() {

			synchronized (number1) {

				try {
					Thread.sleep(2000);

					System.out.println("\nThread 02 started.\nYou entered no1 * no2 = result as output");

					for (Entry<String, Integer> mapEntry : number1.entrySet()) {

						System.out.println(mapEntry.getKey() + mapEntry.getValue());
					}
					number1.notify();
					
					System.out.println("Thread 01 notified ");

					new T1().start();
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}
		}
	}
}