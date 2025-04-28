import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static public void main(String[] args) {

//        Example for the first BigDecimal method

        BigDecimal bd1 = new BigDecimal("123.456789");
        double result1 = BigDecimalOperations.toDoubleRoundedToHundredth(bd1);
        System.out.println(bd1 + " rounded to hundredth: " + result1);

//        Example for the second BigDecimal method

        BigDecimal bd2 = new BigDecimal("123.456789");
        BigDecimal result2 = BigDecimalOperations.negateAndRoundToTenth(bd2);
        System.out.println(bd2 + " negated and rounded to tenth: " + result2);

//        Usage of the Car Inventory system

        Sedan sedan = new Sedan("123456789", "Ford", "Focus", 100000);
        UtilityVehicle suv = new UtilityVehicle("5TDYK3DC1ES543210", "Toyota", "Highlander", 28500, true);
        Truck truck = new Truck("1FTFW1ET5DFA98765", "Ford", "F-150", 42000, 12000.5);

        System.out.println("=== Example 1: Individual Car Information ===");
        System.out.println("\nSedan Information:");
        System.out.println(sedan.getInfo());

        System.out.println("\nUtility Vehicle Information:");
        System.out.println(suv.getInfo());

        System.out.println("\nTruck Information:");
        System.out.println(truck.getInfo());

        System.out.println("\n=== Example 2: Using Polymorphism with Car List ===");
        List<Car> carInventory = new ArrayList<>();
        carInventory.add(sedan);
        carInventory.add(suv);
        carInventory.add(truck);

        carInventory.add(new Sedan("JH4DA9470PS000151", "Acura", "Integra", 120000));
        carInventory.add(new UtilityVehicle("WBXPC93417WF10237", "BMW", "X3", 15000, false));
        carInventory.add(new Truck("3GCUKPEC8JG415935", "Chevrolet", "Silverado", 8000, 13500.0));

        System.out.println("Complete Car Inventory:");
        for (int i = 0; i < carInventory.size(); i++) {
            System.out.println("\nCar #" + (i + 1) + ":");
            System.out.println(carInventory.get(i).getInfo());
            System.out.println("----------------------------------------");
        }

        System.out.println("\n=== Example 3: Updating Car Information ===");
        System.out.println("Before update:");
        System.out.println(sedan.getInfo());

        // Update sedan mileage after maintenance
        sedan.setMileage(36500);

        System.out.println("\nAfter update:");
        System.out.println(sedan.getInfo());

//        Example of usage of the Video Streaming Service

        // Create a TV series
        TvSeries strangerThings = new TvSeries("Stranger Things", 50, 34);
        System.out.println("\n" + strangerThings.getInfo());
        System.out.println();

        // Create a movie
        Movie inception = new Movie("Inception", 148, 8.8);
        System.out.println(inception.getInfo());

//        Example of usage of the IntArrayList

        System.out.println("\nTesting IntArrayList:");
        IntArrayList list = new IntArrayList();

        // Add elements and observe capacity changes
        System.out.println("Initial capacity: " + list.capacity());

        // Add elements to trigger resizing
        for (int i = 0; i < 20; i++) {
            list.add(i);
            System.out.println("Added " + i + ", Size: " + list.size() + ", Capacity: " + list.capacity());
        }

        // Verify elements were stored correctly
        System.out.println("\nVerifying elements:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element at index " + i + ": " + list.get(i));
        }

        System.out.println("\nTesting IntVector:");
        IntVector vector = new IntVector();

        // Add elements and observe capacity changes
        System.out.println("Initial capacity: " + vector.capacity());

        // Add elements to trigger resizing
        for (int i = 0; i < 30; i++) {
            vector.add(i);
            System.out.println("Added " + i + ", Size: " + vector.size() + ", Capacity: " + vector.capacity());
        }

        // Verify elements were stored correctly
        System.out.println("\nVerifying elements:");
        for (int i = 0; i < vector.size(); i++) {
            System.out.println("Element at index " + i + ": " + vector.get(i));
        }

    }

}
