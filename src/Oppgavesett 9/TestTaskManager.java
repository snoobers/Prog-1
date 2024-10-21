public class TestTaskManager {
    
    public static void main(String[] args) {

        TaskManager taskManager = new TaskManager(10);

        Student Joe = new Student("Joe");
        Student Moe = new Student("Moe");
        Student Mary = new Student("Mary");
        Student Suggon = new Student("Suggon");

        taskManager.registerNewStudent(Suggon);
        taskManager.registerNewStudent(Mary);
        taskManager.registerNewStudent(Moe);
        taskManager.registerNewStudent(Joe);

        taskManager.increaseTaskAmount("joe", 10);
        taskManager.increaseTaskAmount("moe", 1);
        taskManager.increaseTaskAmount("mary", 5);
        taskManager.increaseTaskAmount("suggon", 10000);

        int numberOfStudents = taskManager.findNumberOfStudents();
        System.out.println(numberOfStudents);

        System.out.println(taskManager.toString());

        // boolean running = true;

        // while (running) {
        //     System.out.println("Menu:");
        //     System.out.println();
        // }

    }
}
