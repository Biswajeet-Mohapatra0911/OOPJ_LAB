import java.util.Scanner;

// Class to count objects
class ObjectCounter {
    private static int count = 0;  // Static variable shared by all objects
    private String name;

    // Default constructor
    public ObjectCounter() {
        count++;
        this.name = "Unknown";
    }

    // Overloaded constructor
    public ObjectCounter(String name) {
        count++;
        this.name = name;
    }

    // Static method to get object count
    public static int getCount() {
        return count;
    }

    // Instance method to display object details
    public void display() {
        System.out.println("Object name: " + name);
    }
}

// Main class
public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of objects to create: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        ObjectCounter[] objects = new ObjectCounter[n];

        // Create objects with user input names
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name for object " + (i + 1) + ": ");
            String name = sc.nextLine();
            objects[i] = new ObjectCounter(name);
        }

        System.out.println("\nObjects created:");
        for (ObjectCounter obj : objects) {
            obj.display();
        }

        // Display total number of objects
        System.out.println("\nTotal number of objects created = " + ObjectCounter.getCount());

        sc.close();
    }
}
