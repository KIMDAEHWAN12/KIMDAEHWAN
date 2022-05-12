//0512 #1 
// 상속, interface 오류제어(try catch)
// 사원정보
// 사원번호 성명 부서 직책
// 졸업원/매니저
package test1;
import java.util.Scanner;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner(System.in);
		String empNo = null;
        String name = null;
        String part = null;
        String position = null;
        
        Employee emp = null; //사원
        Manager m = null; //관리자
        
    try {
        System.out.print("사번 입력 : ");
        empNo = s.next();
        System.out.print("성명 입력 : ");
        name = s.next();
        System.out.print("부서 입력 : ");
        part = s.next();
        System.out.print("직위 1:사원 2:대리 3:과장 4: 부장 입력 : ");
        position = s.next();
     } catch(Exception e) {
    	System.out.println("입력 오류");
     }
    
    if (position.equals("1"))
    { 
    	//System.out.println("사원");
    	emp = new Employee(empNo, name, part);
    	emp.result();
    }
    else if (position.equals("2"))
    {
    	emp = new Employee(empNo, name, part);
    	emp.result();
    }
    else if (position.equals("3")) // 과장
    {
    	//System.out.println("manager");
    	m = new Manager(empNo, name, part, position);
    	m.result();
    }
    else if (position.equals("4"))
    {
    	//System.out.println("manager");
    	m = new Manager(empNo, name, part, position);
    	m.result();
    }
    }
}
