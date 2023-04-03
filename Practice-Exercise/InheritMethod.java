 //A program to Create a parent class called "Person" a child class called "Student" that inherits from Person
//Create an object of the Student class and call both the "speak" and "study" methods.
 
 
 class Person				//parent class
{
String name;
int age;
 public void Speak()		//method to initialize attributes
 {
  this.name="SANA";
  this.age=23;
 }
}
 class Student extends Person		//child class 
 {
  String grade;
  public void Study()
  {
    this.grade="A";
  }
 
  public void Display()		//method to display output
  {
	   System.out.println("Name :" + name);
	   System.out.println("Age :" + age);
	   System.out.println("Grade :" + grade);
  } 
 
 }


class InheritMethod				//main class
 {
	public static void main(String args[])	//main method
	
	{
		Student s1=new Student();		//object creation
		s1.Speak();
		s1.Study();			//invoking methods
		s1.Display();
	}
 }
 