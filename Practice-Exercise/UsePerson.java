/*Create an interface called ""Person"" with a method called ""speak"".
 Create two classes called ""Student"" and "Teacher" that implement the 
 Person interface and implement the "speak"method. Create objects of both 
 the Student and Teacher classes and call their respective ""speak"" methods.*/
 
 
 
 interface Person					//interface
{
	public void Speak();			//abstract method
}

class Student implements Person		//class to implement abstract method Speak
	{
		String speak;
		public void Speak()
		{
			this.speak="Answering Questions";
			System.out.println("The students are :"+ speak);
		}
	}
class Teacher implements Person		//class to implement abstract method Speak
{
String speak;
	public void Speak()
	{
		this.speak="Asking questions";
		System.out.println(" The Teacher is :" + speak);
	}
}
		
		class UsePerson
		{
			public static void main(String args[])	//main method
			{
				Student s=new Student();		//object creating
				Teacher t=new Teacher();
				s.Speak();					//invokin/calling methods
				t.Speak();
			}
		}
