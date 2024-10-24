import java.util.Scanner;

public class MainTaskManager {
    
    public static void main(String[] args) {

        TaskManager taskManager = new TaskManager(10);
        
        boolean running = true;

        Scanner scanner = new Scanner(System.in);

        while (running) {
            System.out.println("Menu:");
            System.out.println("1. Register a new student");
            System.out.println("2. Find number of students");
            System.out.println("3. Increase task amount of a student");
            System.out.println("4. Find amount of tasks completed by a student");
            System.out.println("5. Print a total overview");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    scanner.nextLine();
                    System.out.println("Enter name of student you would like to register:");
                    String name = scanner.nextLine();
                    Student student = new Student(name);
                    taskManager.registerNewStudent(student);
                    System.out.println(name + " was added to the register");
                    break;
                case 2:
                    System.out.println("Number of students: " + taskManager.findNumberOfStudents());
                    break;
                case 3:
                    scanner.nextLine();
                    System.out.println("Enter name of student you would like to register:");
                    name = scanner.nextLine();
                    System.out.println("How many tasks to increase by?");
                    int tasks = scanner.nextInt();
                    taskManager.increaseTaskAmount(name, tasks);
                    break;
                case 4:
                    scanner.nextLine();
                    System.out.println("Enter name of student you would like to register:");
                    name = scanner.nextLine();
                    System.out.println(taskManager.findAmountOfTasks(name));
                    break;
                case 5:
                    System.out.println(taskManager.toString());
                    break;
                case 6:
                    System.out.println("Have a nice day!");
                    running = false;

                    break;
                default:
                    break;
            }
        }
        scanner.close();
    }
}
