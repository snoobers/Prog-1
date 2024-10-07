import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ArbTaker {
    
    // Create our variables
    Person personnel;
    private int employeeID;
    private int monthSalary;
    private LocalTime yearOfEmployment;
    private double taxPercent;

    // Constructor
    public ArbTaker(int employeeID, int monthSalary, LocalTime yearOfEmployment, double taxPercent){
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

    public LocalTime getYearOfEmployment(){
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

}
