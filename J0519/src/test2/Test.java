//0519 #2
// file try catch
package test2;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.FileNotFoundException;

class Test1{
	public void me() {
		try {
			InputStream in = new FileInputStream("input.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}

class Test2{
	public void me() {
		try {
			InputStream in = new FileInputStream("input.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
public class Test {

	public static void main(String[] args) {
		Test1 t1 = new Test1();
		t1.me();
		
		Test2 t2 = new Test2();
		t2.me();
		}
	}
