/*
 * SCENARIO: A university portal's password validator is supposed to enforce: at least 8 characters, contains a number, and contains an uppercase letter. It accepts invalid passwords and rejects valid ones. 
 * TASK: There are two bugs — one syntax-related and one logical. Find and fix both. 
 * EXPECTED OUTPUT:
 * true 
 * false 
 * false 
 * false 
 */

public class ExerciseTwoThree {
    public static boolean hasNumber(String str) {
        return str.matches(".*[0-9].*");
    }

    public static boolean hasUppercase(String str) {
        return str.matches(".*[a-z].*");
    }

    public static boolean isValidPassword(String password) {
        boolean longEnough = password.length() > 8;
        boolean hasNum     = hasNumber(password);
        boolean hasUpper   = hasUppercase(password)
        return longEnough && hasNum && hasUpper;
    }

    public static void main(String[] args) {
        System.out.println(isValidPassword("Secure1pass")); // Expected: true
        System.out.println(isValidPassword("secure1pass")); // Expected: false (no uppercase)
        System.out.println(isValidPassword("Securepass")); // Expected: false (no number)
        System.out.println(isValidPassword("Sec1")); // Expected: false (too short)
    }
}
