//A java program to create a class calculation add methods addition, substraction, multiplication and divisionand creating objects and using methods.  
 
 
class Calculation							//declaring a class
 {
	 int a=40, b=4, s=0;				//data members
	 void Add()							//method header
	 {
		 s=a+b;									
		 System.out.println("the sum of no.s is :"+ s);				//method body
	 }
	 void sub()
	 {
		 s=a-b;
		 System.out.println("the sub of no.s is :"+ s);
	 }
	 void multiply()
	 {
		 s=a*b;
		 System.out.println("the multiplication of no.s is :"+ s);
	 }
	 void Div()
	 {
		 s=a/b;
		 System.out.println("the division of no.s is :"+ s);
	 }
 }
	class UseCalculate2
	{
		public static void main(String args[])
		{
			 Calculation p=new  Calculation();					//creating object of class  Calculation
			p.Add();								//calling method Add() or invoking method Add()
			p.sub();
			p.multiply();							 
			p.Div();
		}
	}