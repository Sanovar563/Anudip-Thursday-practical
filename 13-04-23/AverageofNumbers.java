/*Create two thread.one thread is finding average of first 50 numbers
 *  and other thread is printing square of number store in array arr={10,15,20,25,30}.*/
 

package MultiThreading;

public class AverageofNumbers {

	public static void main(String[] args) {
        Thread t1 = new Thread(new AverageThread());
        Thread t2 = new Thread(new SquareThread());
        
        t1.start();
        t2.start();
    }
}

class AverageThread implements Runnable {
    public void run() {
        int sum = 0;
        for (int i = 1; i <= 50; i++) {
            sum += i;
        }
        double avg = sum / 50.0;
        System.out.println("Average of first 50 numbers: " + avg);
    }
}

class SquareThread implements Runnable {
    private int[] arr = {10, 15, 20, 25, 30};
    
    public void run() {
        for (int i = 0; i < arr.length; i++) {
            int square = arr[i] * arr[i];
            System.out.println("Square of " + arr[i] + " is " + square);
        }
    }
}