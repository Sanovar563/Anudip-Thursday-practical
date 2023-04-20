package practical;

import java.util.Iterator;
import java.util.LinkedList;

public class Colors {

	public static void main(String[] args) {
		
		LinkedList l=new LinkedList();
		l.add("White");
		l.add("Green");
		l.add("Blue");
		l.add("Yellow");
		l.add("Orange");
		l.add("Red");
		l.add("Black");
		l.add("Brown");

        // Append "Red" at the end of the linked list
		l.addLast("Red");
		System.out.println(l);
	
		   // Iterate through all elements starting from the fourth element
        for (int i = 3; i < l.size(); i++) {
            System.out.println(l.get(i));
        }
        		System.out.println(" ");
			
        		// Iterate the linked list in reverse order
			   Iterator<String> it = l.descendingIterator();
		        while (it.hasNext()) {
		        	
		        	  System.out.println(it.next());	        
}
}
}
