package Com.sample;
class Grandparent{
	String height="5'6";
	public void habit1() {
		System.out.println("ZOOLOGIST");
	}
}
class Parent extends Grandparent{
	String color="FAIR";
	public void habit2() {
		System.out.println("IS BILINGUAL");
	}
}
class Child extends Parent{
	String gender;
}
public class Multi_inherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		c.gender="MALE";
		System.out.println("Child's gender is :"+c.gender);
		System.out.println("Child's color is :"+c.color);
		System.out.println("Child's height is :"+c.height);
		System.out.println("Child acquired from grandpa is :");
		c.habit1();
		System.out.println("Child acquired from parent is :");
		c.habit2();
		
	}

}
