/*
 * SCENARIO: A university portal's password validator is supposed to enforce: at least 8 characters, contains a number, and contains an uppercase letter. It accepts invalid passwords and rejects valid ones. 
 * TASK: There are two bugs — one syntax-related and one logical. Find and fix both. 
 * EXPECTED OUTPUT:
 * true 
 * false 
 * false 
 * false 
 */

function hasNumber(str) {
  return /[0-9]/.test(str);
}

function hasUppercase(str) {
  return /[a-z]/.test(str);
}

function isValidPassword(password) {
  const longEnough  = password.length > 8;
  const hasNum      = hasNumber(password);
  const hasUpper    = hasUppercase(password)
  return longEnough && hasNum && hasUpper;
}

console.log(isValidPassword('Secure1pass'));   // Expected: true
console.log(isValidPassword('secure1pass'));   // Expected: false (no uppercase)
console.log(isValidPassword('Securepass'));    // Expected: false (no number)
console.log(isValidPassword('Sec1'));          // Expected: false (too short)