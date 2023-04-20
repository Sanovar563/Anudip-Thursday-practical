package practical;
import java.util.HashMap;
import java.util.Map;

public class HashmapP {

	public static void main(String[] args) {
		// Create a new HashMap to store student information
        Map<Integer, String> students = new HashMap<>();

        // Add some students to the HashMap
        students.put(103, "Ibrahim");
        students.put(104, "Musa");
        students.put(105, "Noor");
        students.put(204, "Hoor");

        // Print the contents of the HashMap
        System.out.println("Students Name and ID:");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
            
    
        }

        int searchKey = 105;
        if (students.containsKey(searchKey)) {
            System.out.println("Yes Map contains a mapping for " + searchKey);
        } else {
            System.out.println("No Map does not contain a mapping for " + searchKey);
        }
        int size = students.size();
        System.out.println("The size of the HashMap is: " + size);
	
       System.out.println(" ");
        // Copy the mappings to a new HashMap
        Map<Integer, String> newStudents = new HashMap<>();
        newStudents.putAll(students);
        // Print the contents of the new HashMap
        System.out.println("New HashMap:");
        for (Map.Entry<Integer, String> entry : newStudents.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

	
	}
