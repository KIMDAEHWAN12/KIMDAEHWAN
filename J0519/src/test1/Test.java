//0519 #1 오류제어 try ~ catch
//app => os interrupt -> 처리 프로그램
//키보드 ctrl alt del os bug blue screen
//buffering 송수신 fifo, spooling, gpu -acc
//generic type error <String> T
//divide by zero 3/0
package test1;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int x, y;
		int z;
		x = (int)(Math.random()*100);
		y = (int)(Math.random()*100);
		if (y == 0)
		{
			System.out.print("0이 아닌 양수값 입력 : ");
			y = s.nextInt();
		}
		
		if (y==0)
			System.out.println("divide by zero error!");
		else
		{
			try {
				z = x/y;
				System.out.printf("z = %d\n" , z);
				// file read
				// thread 
			}
			catch(ArithmeticException e) {
				z = -1;
				System.out.println(e.getMessage());
			}
			finally {
				System.out.println("error processed");
			}
		}
	}
}
