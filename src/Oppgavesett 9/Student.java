

public class Student {
    
    private String name;
    private int numberOfTasks; //Amount of approved tasks submitted by student

    public Student(String name){
        this.name = name;
        this.numberOfTasks = 0;
    }

    //Getter methods
    public String getName(){
        return name;
    }

    public int getNumberOfTasks(){
        return numberOfTasks;
    }

    public void increaseTaskAmount(int increasedBy){
        this.numberOfTasks += increasedBy;
    }

    public String toString(){
        return name + " has completed '" + numberOfTasks + "' tasks.";
    }
}
