package Com.sample;
class Rbibank{
	public double getRateOfInterest() {
		return 5.0;
	}
}
class SBI extends Rbibank{
	@Override
	//the method specified in parent class can be used in childclass and O/P can be modified
	public double getRateOfInterest() {
		return 6.5; //polymorphism
	}
	public void SBIspecialfeature() {
		System.out.println(" FLAT 50% off on 1st loan ");
	}
}
class ICICI extends Rbibank{
	public double getRateOfInterest() {
		return 7.5;
    }
}
class AXIS extends Rbibank{
	public double getRateOfInterest() {
		return 10;
	}
}
public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rbibank rb=new Rbibank();
		Rbibank rb1=new SBI();//upcasting (creating an object for the child class using parent class)
		SBI sb1=new SBI();
		Rbibank rb2=new SBI();//overriden methods only can be accessed using parentclass(in upcasting method)
		ICICI  ici=new ICICI();
		AXIS ax=new AXIS();
		System.out.println("RBI RATE OF INTEREST IS : "+ 	rb.getRateOfInterest());
		System.out.println("SBI RATE OF INTEREST IS : "+ 	sb1.getRateOfInterest());
		System.out.println("ICICI RATE OF INTEREST IS : "+ 	ici.getRateOfInterest());
		System.out.println("NEW SBI RATE OF INTEREST IS : "+ 	rb1.getRateOfInterest());
		System.out.println("AXIS RATE OF INTEREST IS : "+ 	ax.getRateOfInterest());
		sb1.SBIspecialfeature();
	}

}
