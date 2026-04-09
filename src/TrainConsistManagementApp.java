import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * ========================================================
 * MAIN CLASS - UseCase7TrainConsistMgmnt
 * ========================================================
 *
 * Use Case 7: Sort Bogies by Capacity (Comparator)
 *
 * Description:
 * This class sorts passenger bogies based on seating
 * capacity using a custom Comparator.
 *
 * At this stage, the application:
 * - Creates bogie objects
 * - Stores them in a list
 * - Displays unsorted data
 * - Sorts using Comparator logic
 * - Displays sorted result
 *
 * This maps custom ordering using Comparator.
 *
 * @author Tejas
 * @version 7.0
 */
public class TrainConsistManagementApp {

    // Inner Bogie class to model passenger bogies
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("==================================================");
        System.out.println(" UC7 - Sort Bogies by Capacity (Comparator) ");
        System.out.println("==================================================\n");

        // Create list of passenger bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Second Sitting", 90));
        bogies.add(new Bogie("Third AC", 64));

        // Display unsorted bogies
        System.out.println("Unsorted Bogies:");
        for (Bogie b : bogies) {
            System.out.println("  " + b.name + " → Capacity: " + b.capacity);
        }

        // Sort using Comparator (by capacity ascending)
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        // Display sorted bogies
        System.out.println("\nSorted Bogies (by Capacity - Ascending):");
        for (Bogie b : bogies) {
            System.out.println("  " + b.name + " → Capacity: " + b.capacity);
        }

        System.out.println("\nProgram continues...");
    }
}