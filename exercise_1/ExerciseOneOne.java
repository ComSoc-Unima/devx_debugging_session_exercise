/*
 * SCENARIO: You're building a student registration page. A classmate wrote a greeting function but it crashes immediately on load. 
 * TASK: Find and fix the syntax error. The function should print a welcome message to the console. 
 * EXPECTED OUTPUT:
 * Welcome, Maria! 
 * You are enrolled in: Computer Science 
 */

public class ExerciseOneOne {
    public static void welcomeStudent(String name, String course) {
        System.out.println("Welcome, " + name + "!");
        System.out.println("You are enrolled in: " + course
    }

    public static void main(String[] args) {
        welcomeStudent("Maria", "Computer Science");
    }
}
