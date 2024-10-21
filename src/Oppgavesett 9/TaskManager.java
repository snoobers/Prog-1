/**
 * TaskManager
 */
public class TaskManager {

    private Student[] students;
    private int numberOfStudents = 0;

    public TaskManager(int maxNumberOfStudents){
        students = new Student[maxNumberOfStudents];

    }

    public int findNumberOfStudents(){
        return numberOfStudents;
    }

    public boolean registerNewStudent(Student student){
        if (numberOfStudents < students.length){
            students[numberOfStudents] = student;
            numberOfStudents ++;
            return true;
        }
        return false;
    }

    public boolean increaseTaskAmount(String name, int increaseBy){
        for (int i = 0; i < students.length; i ++){
            if (students[i].getName().toLowerCase().equals(name.toLowerCase())){
                students[i].increaseTaskAmount(increaseBy);
                return true;
            }
        }
        return false;
    }

    public int findAmountOfTasks(String name){
        int tasksCompleted = 0;
        for (int i = 0; i < students.length; i ++){
            if (students[i].getName().toLowerCase().equals(name.toLowerCase())){
                tasksCompleted = students[i].getNumberOfTasks();
            } else {
                System.out.println("Student is not in the list");
            }
        }
        return tasksCompleted;
    }

    public String toString() {
        StringBuilder result = new StringBuilder("Task overview:\n");
        for (int i = 0; i < numberOfStudents; i++) {
            result.append(students[i].toString()).append("\n");
        }
        return result.toString();
    }
}