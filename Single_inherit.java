package Com.sample;
class Teacher{
	String name;
	public void data() {
		System.out.println("JAVA COURSE");
	}
}
class Student extends Teacher{
	String rollno;
}
public class Single_inherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher t1 = new Teacher();
		Student s1 = new Student();
		t1.name="SANGEETHA";
		s1.rollno="5U2";
		s1.name="RISHIKA";
		s1.data();
		System.out.println("Teacher name :"+t1.name);
		System.out.println("Student name :"+s1.name);		
		System.out.println("Student rollno:"+s1.rollno);
		

}
}