/* Write a program to take input of marks of 3 subjects from the user. 
 * Check if the total of marks given by the user is greater than 50 else throw an exception saying "You Failed". 
 * Or else print Grade is A if the total is greater than 280. 
 * Grade B if the total is greater than 200. Grade C if the total is greater than 150. Grade D if the total is greater than 50.*/
 

	import java.util.Scanner;

	public class Grades {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        try {
	            // Take input of marks of 3 subjects from the user
	            System.out.print("Enter marks of subject 1: ");
	            float marks1 = sc.nextFloat();
	            
	            System.out.print("Enter marks of subject 2: ");
	            float marks2 = sc.nextFloat();
	            
	            System.out.print("Enter marks of subject 3: ");
	            float marks3 = sc.nextFloat();
	            
	            // Calculate total marks
	            float totalMarks = marks1 + marks2 + marks3;
	            
	            // Check if the total of marks given by the user is greater than 50
	            if (totalMarks <= 50) {
	                throw new Exception("You Failed");
	            }
	            
	            // Print grade based on the total marks
	            if (totalMarks > 280) {
	                System.out.println("Grade is A");
	            } else if (totalMarks > 200) {
	                System.out.println("Grade is B");
	            } else if (totalMarks > 150) {
	                System.out.println("Grade is C");
	            } else if (totalMarks >50){
	                System.out.println("Grade is D");
	            }
	            
	        } catch (Exception e) {
	            System.out.println(e);
	        } 
	        finally 
	        {
	        	   System.out.println("have a good day");
	        }
	    }
	}
