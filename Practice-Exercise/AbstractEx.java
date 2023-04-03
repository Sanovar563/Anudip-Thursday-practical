//A program to create abstract class shape with abstract method  CalculateArea and implement with subclass circle and rectangle

abstract Shape					//interface
{
	abstract void CalculateArea()	;	//abstract method
}
	 class Circle implements Shape	 
	{
		public void CalculateArea()		//subclass to implement abstract method
		{
			System.out.println("Area of Circle");
		}
	}
	
	class Rectangle implements Shape	 
	{
	public void CalculateArea()		//subclass to implement abstract method
	{
	System.out.println("Area of Reactangle");
	}
	}
	
	class AbstractEx
	{
		public static void main(String args[])
		{
		Circle c=new Circle();	//creating object
		c.CalculateArea();
		Rectangle r=new Rectangle();
		r.CalculateArea();			//calling method
		}
	}
		
