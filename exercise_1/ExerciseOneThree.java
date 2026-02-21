/*
 * SCENARIO: A grade-checker function is supposed to print 'Pass' for scores of 50 and above, and 'Fail' otherwise. Students scoring exactly 50 are incorrectly being told they failed. 
 * TASK: Find and fix the logical error in the condition. 
 * EXPECTED OUTPUT:
 * Pass 
 * Fail 
 * Pass 
 */

public class ExerciseOneThree {
    public static void checkGrade(int score) {
        if (score > 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }

    public static void main(String[] args) {
        checkGrade(50); // Should print: Pass
        checkGrade(49); // Should print: Fail
        checkGrade(75); // Should print: Pass
    }
}
