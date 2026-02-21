/*
 * SCENARIO: A classmate is building a student list but the array declaration has multiple syntax mistakes. 
 * TASK: Fix all syntax errors so the array prints correctly. 
 * EXPECTED OUTPUT:
 * 1. Alice 
 * 2. Bob 
 * 3. Carol 
 * 4. David 
 */

const students = ['Alice', 'Bob' 'Carol', 'David'];

for (let i = 0; i <= students.length; i++) {
  console.log((i + 1) + '. ' + students[i];
}