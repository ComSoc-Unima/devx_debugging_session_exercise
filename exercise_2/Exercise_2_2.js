/*
 * SCENARIO: A grade-book function calculates the average of a student's scores and assigns a letter grade. The average is correct but the letter grades are wrong.
 * TASK: Find the logical error in the grading thresholds. All grade boundaries use 'standard' university grading (90=A, 80=B, 70=C, 60=D).
 * EXPECTED OUTPUT:
 * Average: 78.4
 * Grade:   C
 */

function average(scores) {
  let sum = 0;
  for (let s of scores) sum += s;
  return sum / scores.length;
}

function letterGrade(avg) {
  if (avg >= 90) return "A";
  if (avg >= 80) return "B";
  if (avg >= 60) return "C";
  if (avg >= 70) return "D";
  return "F";
}

const scores = [85, 72, 90, 68, 77];
const avg = average(scores);
console.log("Average: " + avg.toFixed(1));
console.log("Grade:   " + letterGrade(avg));
