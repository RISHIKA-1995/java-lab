package Com.sample;
 abstract class Shape
{
	int a,b;
	void printArea() 
	{
		//empty method
	}
}
class Circle extends Shape
{
	Circle(int radius)
	{
	   a=radius;
	}
	void printArea()
	{
		System.out.println("Area of the Circle : "+(3.14*a*a));
	}
}
class Rectangle extends Shape
{
	Rectangle(int length,int breadth)
	{
	   a=length;
	   b=breadth;
	}
	void printArea()
	{
		System.out.println("Area of the Rectangle : "+(a*b));
	}
}
class Triangle extends Shape
{
	Triangle(int base,int height)
	{
	   a=base;
	   b=height;
	}
	void printArea()
	{
		System.out.println("Area of the Triangle : "+(0.5*a*b));
	}
}

public class Abstract_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape c=new Circle(4);
		Shape r=new Rectangle(7,4);
		Shape t=new Triangle(6,7);
		c.printArea();
		r.printArea();
		t.printArea();

	}

}
