//0519 #5
//multi thread
package test5;

public class Test extends Thread{
	
	private int num = 0;
	
	public Test(int num)
	{
		this.num = num;
	}
	
	public void run()
	{
		System.out.println(this.num + "thread start");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		for (int i=0; i < 10; i++) //seq
		{
			Test t = new Test(i);
			t.start();
		}
		System.out.println("main end");
	}
}
