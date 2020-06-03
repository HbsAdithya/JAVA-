package ques02a;

public class MainThreadApp {

	public static void main(String[] args) throws InterruptedException {
		//extends Thread
		CountDown countdown1 = new CountDown();
		Thread countDown = new Thread(new CountDown());
		
		//implements Runnable
		Thread calcsum1 = new Thread (new CalcSum());
		Thread calcsum2 = new Thread (new CalcSum());
		
		calcsum1.setName("Black");
		calcsum2.setName("White");
		
		countDown.start();
		countDown.join();
		
		calcsum1.start();
		calcsum1.join();
		
		calcsum2.start();
		calcsum2.join();

	}

}
