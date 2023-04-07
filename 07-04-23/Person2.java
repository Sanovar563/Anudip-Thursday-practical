/*write a program using constructor. create a class Person with Id, Name, Designation. 
Ask the user what are his inputs and according to that call the constructor*/

import java.util.Scanner;

 class Person2 {
   int id;									
   static String name= "Sana";				//static data member
    String designation;

    Person2(int id, String name, String designation) 	//parameterized constructor
	{
        this.id = id;
        this.designation = designation;
    }

    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);	//scanner

        System.out.print("Enter ID: ");
        int id = scanner.nextInt();

       System.out.print("Name: " +name);

        System.out.print("\nEnter Designation: ");
        String designation = scanner.next();

        Person2 person = new Person2(id, name, designation);	//passing parameters

        System.out.println("Person created: " + person.id + " " + person.name +  " " + person.designation);
    }
}

 