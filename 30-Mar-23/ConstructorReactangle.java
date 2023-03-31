//A program to create class rectangle and create method to print length and breadth create constructor to initialize them and print  area and perimeter of rectangle.

class Rectangle
{
int length, breadth,  area=0, perimeter=0;

	 Rectangle(int length, int breadth)		//parameterized constructor
	{
			this.length=length;
			this.breadth=breadth;
			this.area=area;
			area=length*breadth;
			perimeter=2*(length+breadth);
	}
		void display1()									//method to print area 
	{
		System.out.println("area of rectangle :" + area);
	}
		void display2()										//method to print perimeter
	{
		System.out.println("perimeter of rectangle :" + perimeter);
	}
}
public class  ConstructorReactangle
	{
		public static void main(String args[])		//main method
		{
		 Rectangle t2=new  Rectangle(40, 30);	//passing initial values 
			t2.display1();						//invoking method display1
			t2.display2();						//invokin method display2
		}
	}
