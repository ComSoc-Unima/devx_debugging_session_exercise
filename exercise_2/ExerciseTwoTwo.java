/*
 * SCENARIO: A grade-book class calculates the average of a student's scores and assigns a letter grade. The average is correct but the letter grades are wrong.
 * TASK: Find the logical error in the grading thresholds. All grade boundaries use 'standard' university grading (90=A, 80=B, 70=C, 60=D). 
 * EXPECTED OUTPUT:
 * Average: 78.4 
 * Grade:   C 
 */

public class ExerciseTwoTwo {
  public static double average(int[] scores) {
    int sum = 0;
    for (int s : scores)
      sum += s;
    return (double) sum / scores.length;
  }

  public static String letterGrade(double avg) {
    if (avg >= 90)
      return "A";
    if (avg >= 80)
      return "B";
    if (avg >= 60)
      return "C";
    if (avg >= 70)
      return "D";
    return "F";
  }

  public static void main(String[] args) {
    int[] scores = { 85, 72, 90, 68, 77 };
    double avg = average(scores);
    System.out.printf("Average: %.1f%n", avg);
    System.out.println("Grade:   " + letterGrade(avg));
  }
}