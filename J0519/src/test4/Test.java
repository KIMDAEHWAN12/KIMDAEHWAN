//0519 #4
//thread
package test4;

public class Test extends Thread {
	
	//持失切
	//五社球
    public void run()
    {
    	System.out.println("thread start");
    }
	public static void main(String[] args) {
		Test t = new Test();
		t.start();
		
		Test t1 = new Test();
		t1.start();
		
		System.out.println("main end");
		
		Thread t2 = new Thread();
		t2.start();
		
		Thread t3 = new Thread();
		t3.start();
	}
}
