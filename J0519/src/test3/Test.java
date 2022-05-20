//0519 #3
package test3;
import java.util.Scanner;

class CheckAgeException extends Exception {
	public CheckAgeException()
	{
	    super("나이가 유효하지 않습니다");
	}
}
public class Test {
	
	public static int CheckAge() throws CheckAgeException
	{
		Scanner s = new Scanner(System.in);
		System.out.print("나이를 입력 : ");
		int age = s.nextInt();
		if (age < 0)
			throw new CheckAgeException();
		return age;
	}
	public static void main(String[] args){
		
		/*int age = s.nextInt();
		if (age >= 0);
		else {//나이 오류가 발생 
			//while
			//if   */
		int age;
		try {
			age = CheckAge();
			System.out.println("age = " + age);
		} catch (CheckAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
