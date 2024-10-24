import java.util.Scanner;

public class ArrangementClient {

    public static void main(String[] args) {

        // Create a new ArrangemneRegister-objekt
        ArrangementRegister arrangementRegister = new ArrangementRegister();
        
        boolean running = true;
        Scanner scanner = new Scanner(System.in);

        while (running) {
            // Show the menu to the user
            System.out.println("Menu:");
            System.out.println("1. Register a new arrangement");
            System.out.println("2. Find arrangement at a place");
            System.out.println("3. Find arrangement on a date");
            System.out.println("4. Find arrangements between two dates");
            System.out.println("5. Print a total overview");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear buffer 

            switch (choice) {
                case 1: // Register a new arrangement
                    System.out.println("Enter arrangement number:");
                    int number = scanner.nextInt();
                    scanner.nextLine(); // Clear buffer

                    System.out.println("Enter arrangement name:");
                    String name = scanner.nextLine();

                    System.out.println("Enter place:");
                    String place = scanner.nextLine();

                    System.out.println("Enter arranger:");
                    String arranger = scanner.nextLine();

                    System.out.println("Enter type of arrangement:");
                    String type = scanner.nextLine();

                    System.out.println("Enter time (as an integer, e.g., 202310211800 for 18:00 21st October 2023):");
                    long time = scanner.nextLong();

                    arrangementRegister.registerArrangement(number, name, place, arranger, type, time);
                    System.out.println("Arrangement was successfully added!");
                    break;

                case 2: // Find arrangement in given place
                    System.out.println("Enter place to search for:");
                    place = scanner.nextLine();
                    arrangementRegister.findArrangementAtPlace(place);
                    break;

                case 3: // Find arrangement on given date
                    System.out.println("Enter date (as an integer, e.g., 20231021):");
                    long date = scanner.nextLong();
                    arrangementRegister.findArrangementAtDate(date);
                    break;

                case 4: // Find arrangements between dates
                    System.out.println("Enter start date (as an integer, e.g., 20231001):");
                    long startDate = scanner.nextLong();

                    System.out.println("Enter end date (as an integer, e.g., 20231031):");
                    long endDate = scanner.nextLong();

                    arrangementRegister.findArrangementsBetweenDates(startDate, endDate);
                    break;

                case 5: // Print total overview of all arrangements
                    arrangementRegister.listOfArrangements();
                    break;

                case 6: // Exit the program
                    System.out.println("Goodbye!");
                    running = false;
                    break;

                default: // Invalid choice
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
        
        scanner.close(); // Close scanner
    }
}
