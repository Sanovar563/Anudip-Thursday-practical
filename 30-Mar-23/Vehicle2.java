//A program to create parent class Vehicle and inherit it with child class Car.Creatign methos to print attributes like brand year color and displaythem.

class Vehicle					//parent class
{
	 String brand;
	String  model;			//attributes of parent class
	int year;
	 public void Drive()		//method to initialize attributes
	{
		this.brand="Nano";
		this.model="Honda";
		this.year=1998;
		}
}
class  Car extends Vehicle		//child class 
{
	String color;
	 public void Type()			//method to initialize attribute color
	 {
		 this.color="Yellow";
	 }
	 public void  Display()		//method to display output
	{
	System.out.println("The brand of car is : " + brand);
	System.out.println("The model of car is : " +  model);
	System.out.println("The year of launch : " +year);
	System.out.println("The color of car is : " +  color);
	 
	} 
}
class Vehicle2						//main class
{
	public static void main(String args[])		//main method
	{
		Car v1=new  Car();					//object creation
		v1. Drive();
		v1.Type();					//invoking methods
		v1.Display();
		}
}
	
