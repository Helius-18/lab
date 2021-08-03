import java.util.Scanner;
abstract class Shape
{
	int a,b;
	abstract void Area();
}
class Rectangle extends Shape
{
	void Area()
	{
		System.out.println("Area of Rectangle="+ a*b);
	}
}
class Triangle extends Shape
{
	void Area()
	{
		double area=0.5*a*b;
		System.out.println("Area of Triangle="+ area);
	}
}
class Circle extends Shape
{
	void Area()
	{
		double area=3.14*a*a;
		System.out.println("Area of Circle="+area);
	}
}
class AbstractClass
{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		Rectangle r=new Rectangle();
		Triangle t=new Triangle();
		Circle c=new Circle();
		System.out.println("Enter length and breadth of rectangle:");
		r.a=sc.nextInt();
		r.b=sc.nextInt();
		System.out.println("Enter height and base of triangle:");
		t.a=sc.nextInt();
		t.b=sc.nextInt();
		System.out.println("Enter radius circle:");
		c.a=sc.nextInt();
		r.Area();
		t.Area();
		c.Area();
	}
}
