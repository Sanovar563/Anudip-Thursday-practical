/*Write a program to create thread. Where you will take the input from the user and find if the number is odd or even.*/

package MultiThreading;

import java.util.Scanner;

public class NumberThread1 extends Thread {
     int number;
    
    public NumberThread1(int number) {
        this.number = number;
    }
    
    public void run() {
        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        NumberThread1 thread = new NumberThread1(number);
        thread.start();
        
    }
}
