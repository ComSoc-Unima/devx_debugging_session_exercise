/*
 * SCENARIO: A geometry utility is supposed to calculate the area and perimeter of a rectangle. The area is correct but the perimeter is always wrong. 
 * TASK: Identify and fix the logical error in the perimeter formula. 
 * EXPECTED OUTPUT:
 * Area:      24 
 * Perimeter: 20 
 */

public class ExerciseOneFour {
  public static int area(int width, int height) {
    return width * height;
  }

  public static int perimeter(int width, int height) {
    return width + height;
  }

  public static void main(String[] args) {
    System.out.println("Area:      " + area(4, 6));
    System.out.println("Perimeter: " + perimeter(4, 6));
  }
}