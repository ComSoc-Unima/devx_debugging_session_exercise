/*
 * SCENARIO: A geometry utility is supposed to calculate the area and perimeter of a rectangle. The area is correct but the perimeter is always wrong.
 * TASK: Identify and fix the logical error in the perimeter formula.
 * EXPECTED OUTPUT:
 * Area:      24
 * Perimeter: 20
 */

function area(width, height) {
  return width * height;
}

function perimeter(width, height) {
  return width + height;
}

console.log("Area:      " + area(4, 6));
console.log("Perimeter: " + perimeter(4, 6));
