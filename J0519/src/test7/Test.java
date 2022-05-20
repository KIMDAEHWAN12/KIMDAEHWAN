//0519 #7
//thread
//Runnable 람다 expr / 함수명을 사용하?
package test7;

public class Test {
	
	public static void main(String[] args) {
	    //lamda expression
		Runnable task = () -> 
		{
			int x = 10;
			int y = 20;
			System.out.println("x+y = " + (x+y));
		};
		
		Thread t1 = new Thread(task);
		t1.start();
		
		Thread t2 = new Thread(task);
		t2.start();
	}
}
