/*
 * SCENARIO: A utility function should print whether a number is odd or even. It always prints 'Even', even for odd numbers. 
 * TASK: Trace through the logic and fix the bug. 
 * EXPECTED OUTPUT:
 * Even 
 * Odd 
 * Even 
 */

public class ExerciseOneSix {
  public static String classify(int number) {
    if (number % 2 == 1) {
      return "Even";
    } else {
      return "Odd";
    }
  }

  public static void main(String[] args) {
    System.out.println(classify(4)); // Expected: Even
    System.out.println(classify(7)); // Expected: Odd
    System.out.println(classify(0)); // Expected: Even
  }
}