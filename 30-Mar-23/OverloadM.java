//A program in java showing overloading of Add method with 2 and 3 parameters.

class  MethodOverloading							//class
{
		  public void Add(int a, String n)			//parameters within method		 
		{
			System.out.println(" This is method with two parameters");
			
		}
			 public void Add(int d, int b, int c) 		//method overloading 
		{
			System.out.println(" This is method with three parameters");
		}  													//end of method
 }																//end of class
	public class OverloadM										//main class
		{												
			public static void main(String args[])			//main method
			{
				MethodOverloading d=new  MethodOverloading();	//creating object
				d.Add(23, "Sanovar");					//calling method Add() or invoking method Add()
			}
		}