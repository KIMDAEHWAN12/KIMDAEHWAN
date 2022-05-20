//0519 #6
//multi thread
package test6;

public class Test extends Thread{
	
	private int thread_id;
	
	public Test(int i)
	{
		this.thread_id = i;
	}
	
	public void run()
	{
		String name =Thread.currentThread().getName();
		System.out.println(this.thread_id+ "thread start");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		Test t1 = new Test(1);
		t1.start();
		
		Test t2 = new Test(2);
		t2.start();
		
		System.out.println("main end");
	}
}
