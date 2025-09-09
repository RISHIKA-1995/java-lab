package Com.sample;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String a=s.next();
		StringBuilder str=new StringBuilder(a);
		str.reverse();
		String rev_str=str.toString();
		System.out.println("Reversed String : "+rev_str);
		if (rev_str.equals(a))
		{
			System.out.println("YES! It is a Palindrome");
		}
		else
		{
			System.out.println("It is not a Palindrome");
		}

	}

}
