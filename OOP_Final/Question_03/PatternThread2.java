
public class PatternThread2  extends Thread{
	private String pattern;
	private int width;
	private int count;
	
	private Object lock;

	
	public PatternThread2(String pattern, int width, int count, Object lock) {
		super();
		this.pattern = pattern;
		this.width = width;
		this.count = count;
		this.lock = lock;
	}


	public  void run() {
		synchronized(lock) {
			for(int i=0;i<=count;i++) {
				System.out.print("Pattern 02 Thread = " );
				try {
					lock.notify();
					Thread.sleep(1000);
					for(int j=0;j<=width;j++) {
					System.out.print(pattern);
					}
					System.out.println("");
					lock.wait();
				}
					catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("");
			}
			
			
			
			
				}
		}
