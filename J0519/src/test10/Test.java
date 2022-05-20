//0519 #10 È¦¼ö ÇÕ Â¦¼öÀÇ ÇÕ
package test10;

public class Test {

	public static void main(String[] args) {
		
		int odd_sum = 0;
		//odd number sum
		for (int i=0; i<100; i++)
		{
			if (i % 2 == 1)
				odd_sum += i;
		}
		System.out.println("odd sum = " + odd_sum);
		
		int even_sum = 0;
		//even number sum
		for (int i=0; i<100; i++)
		{
			if (i % 2 == 0)
				even_sum += i;
		}
		System.out.println("even sum = " + odd_sum);
	}
}
