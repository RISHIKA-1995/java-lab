package Com.sample;
import java.util.Scanner;
public class SumofIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int even_sum=0;
		int odd_sum=0;
		for(int i =1;i<=10;i++)
		{
			if (i%2==0)
			{
				even_sum+=i;
			}
			else
			{
				odd_sum+=i;
			}
		}
		System.out.println("Sum of even nos is : "+even_sum);
		System.out.println("Sum of odd nos is : "+odd_sum);
			

	}

}
