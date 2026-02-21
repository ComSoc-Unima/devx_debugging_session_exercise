/*
 * SCENARIO: A simple bank account ledger applies a series of transactions (deposits and withdrawals) and prints the final balance. The final balance is wrong. 
 * TASK: Use the VS Code Java debugger (or add System.out.println at each step) to trace the value of balance through every transaction. Find and fix the bug. 
 * EXPECTED OUTPUT:
 * Final balance: $1500.00
 */

public class ExerciseTwoFour {
  private static double applyDeposit(double balance, double amount) {
    return balance + amount;
  }

  private static double applyWithdrawal(double balance, double amount) {
    if (amount > balance) {
      System.out.println("Insufficient funds — withdrawal skipped");
      return balance;
    }
    return balance + amount;
  }

  public static double processTransactions(
      double startBalance, double[] deposits, double[] withdrawals) {
    double balance = startBalance;
    for (double d : deposits)
      balance = applyDeposit(balance, d);
    for (double w : withdrawals)
      balance = applyWithdrawal(balance, w);
    return balance;
  }

  public static void main(String[] args) {
    double[] deposits = { 500, 200, 150 };
    double[] withdrawals = { 100, 50, 200 };
    double final_ = processTransactions(1000, deposits, withdrawals);
    System.out.printf("Final balance: $%.2f%n", final_);
  }
}