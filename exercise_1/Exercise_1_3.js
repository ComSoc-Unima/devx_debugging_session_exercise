/*
 * SCENARIO: A grade-checker function is supposed to print 'Pass' for scores of 50 and above, and 'Fail' otherwise. Students scoring exactly 50 are incorrectly being told they failed. 
 * TASK: Find and fix the logical error in the condition. 
 * EXPECTED OUTPUT:
 * Pass 
 * Fail 
 * Pass 
 */

function checkGrade(score) {
  if (score > 50) {
    console.log('Pass');
  } else {
    console.log('Fail');
  }
}

checkGrade(50);   // Should print: Pass
checkGrade(49);   // Should print: Fail
checkGrade(75);   // Should print: Pass