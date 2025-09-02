package Com.sample;
class Vehicle{
	String name;
	public void speed(int dist,double time) {
		double speed=dist/time;
		System.out.println("Speed of the vehicle is :"+speed);
	}
}
class Car extends Vehicle{
	String company;
	
}
public class Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v=new Vehicle();
		Car c =new Car();
		Vehicle v1= new Car();
		c.name="CAR";
		c.company="BENZ";
		System.out.println("Name of the vehicle :"+c.name);
		System.out.println("Company is :"+c.company);
		v1.speed(150, 1.5);

	}

}
