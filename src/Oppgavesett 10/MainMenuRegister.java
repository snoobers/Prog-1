import java.util.Scanner;

public class MainMenuRegister {

    public static void main(String[] args) {
        
        MenuRegister menuRegister = new MenuRegister();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            // Prompt the mneu to the user
            System.out.println("Menu:");
            System.out.println("1. Register a new menu");
            System.out.println("2. Add a dish to a menu");
            System.out.println("3. Find a dish in the menus");
            System.out.println("4. Find dishes of a specific type");
            System.out.println("5. Find menus within a price interval");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Clear buffer 

            switch (choice) {
                case 1:  // Register a new menu
                    System.out.println("Enter the name of the new menu:");
                    String menuName = scanner.nextLine();
                    menuRegister.registerNewMenu(menuName);
                    System.out.println("New menu '" + menuName + "' was successfully registered.");
                    break;

                case 2:  // Add a new dish to a menu
                    System.out.println("Enter the name of the menu:");
                    menuName = scanner.nextLine();
                    System.out.println("Enter the name of the dish:");
                    String dishName = scanner.nextLine();
                    System.out.println("Enter the price of the dish:");
                    double dishPrice = scanner.nextDouble();
                    scanner.nextLine();  // Clear buffer
                    System.out.println("Enter the type of the dish (e.g., 'Main Course', 'Dessert'):");
                    String dishType = scanner.nextLine();
                    
                    Dish dish = new Dish(dishName, dishPrice, dishType);
                    menuRegister.addDishToMenu(menuName, dish);
                    break;

                case 3:  // Find a dish in the menu
                    System.out.println("Enter the name of the dish to search for:");
                    dishName = scanner.nextLine();
                    menuRegister.findDish(dishName);
                    break;

                case 4:  // Find dishes of a set type 
                    System.out.println("Enter the type of dish to search for (e.g., 'Dessert', 'Main Course'):");
                    String type = scanner.nextLine();
                    menuRegister.findDishesOfType(type);
                    break;

                case 5:  // Find menus within a price interval 
                    System.out.println("Enter the start of the price interval:");
                    double intervalStart = scanner.nextDouble();
                    System.out.println("Enter the end of the price interval:");
                    double intervalEnd = scanner.nextDouble();
                    menuRegister.findMenusWithinInterval(intervalStart, intervalEnd);
                    break;

                case 6:  // Exit program
                    System.out.println("Goodbye!");
                    running = false;
                    break;

                default:  // Invalid choice
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        scanner.close();  // Close scanner
    }
}