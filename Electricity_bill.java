package java5u2;
import java.util.Scanner;
public class Electricity_bill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int unit =s.nextInt();
		int bill;
		if(unit<=50)
		{
			bill=unit*1;
		}
		else if(unit>=50 && unit<=100)
		{
			bill=(50*1)+(unit-50)*2;
		}
		else if(unit>=100 && unit<=200)
		{
			bill=(50*1)+(50*2)+(unit-100)*3;
		}
		else if(unit>=200 && unit<=400)
		{
			bill=(50*1)+(50*2)+(100*3)+(unit-200)*4;
		}
		else
		{
			bill=(50*1)+(50*2)+(100*3)+(200*4)+(unit-400)*5;
		}
		System.out.println("THE CHARGE IS: "+bill);

	}

}

