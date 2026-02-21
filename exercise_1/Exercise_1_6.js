/*
 * SCENARIO: A utility function should print whether a number is odd or even. It always prints 'Even', even for odd numbers.
 * TASK: Trace through the logic and fix the bug.
 * EXPECTED OUTPUT:
 * Even
 * Odd
 * Even
 */

function classify(number) {
  if (number % 2 === 1) {
    return "Even";
  } else {
    return "Odd";
  }
}

console.log(classify(4)); // Expected: Even
console.log(classify(7)); // Expected: Odd
console.log(classify(0)); // Expected: Even
