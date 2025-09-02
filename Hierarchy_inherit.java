package Com.sample;
class Teacher2{
	String name;
	public void Subject() {
		System.out.println("Taught by java maam");
	}
}
class Student1 extends Teacher2{
	String Ones_rollno;
}
class Student2 extends Teacher2{
	String Twos_rollno;
}

public class Hierarchy_inherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher2 t=new Teacher2();
		Student1 s1=new Student1();
		Student2 s2=new Student2();
		t.name="SANGEETHA";
		s1.name="RISHI";
		s1.Ones_rollno="5U2";
		s2.name="BHARGAVI";
		s2.Twos_rollno="5S2";
		System.out.println("Student1 name is : "+s1.name);
		System.out.println("Student1 roll no is : "+s1.Ones_rollno);
		s1.Subject();
		System.out.println("Student2 name is : "+s2.name);
		System.out.println("Student2 roll no is : "+s2.Twos_rollno);
		s2.Subject();
		
	}

}
