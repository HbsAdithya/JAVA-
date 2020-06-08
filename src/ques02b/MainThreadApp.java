package ques02b;

public class MainThreadApp {

	public static void main(String[] args) throws InterruptedException {
		
		Calculation calc = new Calculation();
		
		Thread t1 = new Thread(new ParallelThread(calc, 1, 2));
		Thread t2 = new Thread(new ParallelThread(calc, 3, 4));
		
		
		t1.start();
		t1.join();
		
		t2.start();
		t2.join();
		
		
		
		System.out.println("Factorial of 40 : "+ calc.getAns());
	}

}
