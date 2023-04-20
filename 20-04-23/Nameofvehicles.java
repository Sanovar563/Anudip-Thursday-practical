
package practical;

import java.util.ArrayList;
import java.util.Iterator;

public class Nameofvehicles {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("Safari");
		a.add("Nano");
		a.add("KIA");
		a.add("Tavera");
		a.add("Activa");
		a.add("Pleasure");
		a.add("Royal Enfield Hunter");
		a.add("Verna");
		a.add("Ferrari");
		a.add("Vespa");

		System.out.println(a);
		// Insert an element at the start of the ArrayList
		a.add(0, "Woow!!");
		// Insert an element at the end of the ArrayList
		a.add("Nice!!");
		
		// Update the element at index 7
				a.set(7, "XUV300");
		
		// Retrieve the element at index 4
		String elementAtIndex4 = a.get(4);
		System.out.println("Element at index 4: " + elementAtIndex4);
		
		// Search for the element "Verna"
				if (a.contains("Verna")) {
					System.out.println("Found the vehicle");
				} else {
					System.out.println("Not found");
				}

				// Create a new ArrayList and copy the elements from the original ArrayList
				ArrayList<String> a2 = new ArrayList<String>();
				a2.addAll(a);
				
				
		Iterator<String> itr = a.iterator();
		while (itr.hasNext()) {
			String I = itr.next();
			System.out.println(I);
		}
	}
}
