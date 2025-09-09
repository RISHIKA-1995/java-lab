package java5u2;
class GP{
	GP(){
		super();
		System.out.println("GP CLASS");
	}
}
class P extends GP{
	P(){
		super();
		System.out.println("P CLASS");
		}
}
class C extends P{
	C(){
		super();
		System.out.println("C CLASS");
	}
}
public class About_super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c1=new C();

	}

}

