//0512 #1 
// ���, interface ��������(try catch)
// �������
// �����ȣ ���� �μ� ��å
// ������/�Ŵ���
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
        
        Employee emp = null; //���
        Manager m = null; //������
        
    try {
        System.out.print("��� �Է� : ");
        empNo = s.next();
        System.out.print("���� �Է� : ");
        name = s.next();
        System.out.print("�μ� �Է� : ");
        part = s.next();
        System.out.print("���� 1:��� 2:�븮 3:���� 4: ���� �Է� : ");
        position = s.next();
     } catch(Exception e) {
    	System.out.println("�Է� ����");
     }
    
    if (position.equals("1"))
    { 
    	//System.out.println("���");
    	emp = new Employee(empNo, name, part);
    	emp.result();
    }
    else if (position.equals("2"))
    {
    	emp = new Employee(empNo, name, part);
    	emp.result();
    }
    else if (position.equals("3")) // ����
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
