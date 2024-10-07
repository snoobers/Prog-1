import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;

public class ArbTaker {
    
    // Create our variables
    Person personnel;
    private int employeeID;
    private int monthSalary;
    private LocalDate yearOfEmployment;
    private double taxPercent;

    // Constructor
    public ArbTaker(int employeeID, int monthSalary, LocalDate yearOfEmployment, double taxPercent){
        this.employeeID = employeeID;
        this.monthSalary = monthSalary;
        this.yearOfEmployment = yearOfEmployment;
        this.taxPercent = taxPercent;
    }

    // Getters 
    public int getEmployeeNumber(){
        return employeeID;
    }

    public int getMonthlySalary(){
        return monthSalary;
    }

    public LocalDate getYearOfEmployment(){
        return yearOfEmployment;
    }

    public double getTaxPercent(){
        return taxPercent;
    }

    // Setters for tax percentage and monthly salary
    public void setTaxPercent(double newTax){
        this.taxPercent = newTax;
    }

    public void setMontlySalary(int newSalary){
        this.monthSalary = newSalary;
    }

    // Method for finding out the monthly tax amount
    public double monthlyTaxAmount(){
        double taxFloat = taxPercent / 100;
        double monthlyTax = monthSalary * taxFloat;
        return monthlyTax;
    }

    // Method to find yearly gross salary
    public void grossYearlySalary(){
        double grossYearly = monthSalary * 12;
        System.out.println(personnel.getFirstname() + " earns: " + grossYearly + " in gross salary, yearly.");
    }

    // Method to find amount of tax paid each year
    public void yearlyTax(){
        double yearlyTax = monthlyTaxAmount() * 10 + (monthlyTaxAmount() / 2);
        System.out.println(personnel.getFirstname() + " pays: " + yearlyTax + " in taxes each year.");
    }

    // Method to print name in format "Surname, Firstname"
    public void formattedName(){
        System.out.println(personnel.getSurname() + ", " + personnel.getFirstname());
    }

    // Method to find the age of the employee
    public void findAge(){
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(personnel.getBirthday(), currentDate);
        System.out.println(personnel.getFirstname() + " is " + period.getYears() + " years old.");
    }

    // Method that finds the length of employment
    public void yearsEmployed(){
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(yearOfEmployment, currentDate);
        System.out.println(personnel.getFirstname() + " has been employed in the company for " + period.getYears() + " years.");
    }

    // Method to find out if employee has been employed more than a set time
    public void employedMoreThan(int years){
        LocalDate today = LocalDate.now();
        int differenceYears = (today.getYear() - yearOfEmployment.getYear()) - years;

        // If sentence to check if the difference is positive or negative
        if (differenceYears > 0){
            System.out.println("Yes, " + personnel.getFirstname() + " has been employed for more than " + years + " years.");
        } else {
            System.out.println("No, " + personnel.getFirstname() + " has not been employed for more than " + years + " years.");
        }
    }

}
