import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Person joe = new Person("Joe","Mama", LocalDate.of(1995, 8, 19));
        ArbTaker workerJoe = new ArbTaker(joe, 1234, 40000, LocalDate.of(2010, 3, 27), 20);

        boolean working = true;
        Scanner scanner = new Scanner(System.in);

        while (working){
            System.out.println("------ Menu ------\n");
            System.out.println("1. Set monthly salary.");
            System.out.println("2. Set tax percent.");
            System.out.println("3. Run information methods");
            System.out.println("4. Close application.");

            int sc = scanner.nextInt();

            switch (sc) {
                case 1:
                    System.out.println("What will the new monthly salary be?");
                    int newMonthlySalary = scanner.nextInt();
                    workerJoe.setMontlySalary(newMonthlySalary);
                    System.out.println("The new salary is set!");
                    scanner.nextLine(); // Clear buffer
                    break;
                case 2:
                    System.out.println("What would you like to set as the new tax percent?");
                    double newTaxPercent = scanner.nextDouble();
                    workerJoe.setTaxPercent(newTaxPercent);
                    System.out.println("The new tax percent is set!\n");
                    scanner.nextLine(); // Clear buffer
                    break;
                case 3:
                    scanner.nextLine(); // Clear buffer
                    System.out.println("Would you like to run the methods? Yes/No");
                    String answer = scanner.nextLine();
                    if (answer.toLowerCase().equals("yes")){
                        workerJoe.monthlyTaxAmount();
                        workerJoe.grossYearlySalary();
                        workerJoe.yearlyTax();
                        workerJoe.yearsEmployed();
                        workerJoe.employedMoreThan(10);
                        workerJoe.getYearOfEmployment();
                        workerJoe.findAge();
                        workerJoe.formattedName();
                    }
                    break;
                case 4:
                    System.out.println("Have a great day!");
                    working = false;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
        scanner.close();
    }
}
