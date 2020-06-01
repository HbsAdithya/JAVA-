import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object lock= new Object();
		Scanner sc = new Scanner(System.in);
		String pat1,pat2;
		int c;
		int w;
		
		System.out.println("Enter Textile Pattern = ");
		pat1=sc.next();
		System.out.println("Enter Textile Pattern = ");
		pat2=sc.next();
		System.out.println("Enter Pattern width = ");
		w=sc.nextInt();
		System.out.println("Enter count = ");
		c=sc.nextInt();
		Thread PatternThread2= new PatternThread2(pat2,w,c,lock);
		Thread PatternThread1= new PatternThread1(pat1,w,c,lock);
		
		System.out.println("Threads start printing Patterns ");
		PatternThread2.start();
		PatternThread1.start();
		
	}

}
