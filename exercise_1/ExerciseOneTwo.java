/*
 * SCENARIO: A lab partner wrote a Celsius-to-Fahrenheit converter. It won't compile. 
 * TASK: Fix all syntax errors so the class compiles and runs correctly. 
 * EXPECTED OUTPUT:
 * 212.0 F 
 */

public class ExerciseOneTwo {
  public static double celsiusToFahrenheit(double celsius) {
    return celsius * 9 / 5 + 32
  }

  public static void main(String[] args) {
    double result = celsiusToFahrenheit(100)
    System.out.println(result + " F");
  }
}