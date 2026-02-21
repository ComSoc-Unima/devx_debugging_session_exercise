/*
 * SCENARIO: A simple bank account ledger applies a series of transactions (deposits and withdrawals) and prints the final balance. The final balance is wrong.
 * TASK: Use the debugger (or add console.log at each step) to trace the value of balance through every transaction. Find and fix the bug.
 * EXPECTED OUTPUT:
 * Final balance: $1500.00
 */

function applyDeposit(balance, amount) {
  return balance + amount;
}

function applyWithdrawal(balance, amount) {
  if (amount > balance) {
    console.log("Insufficient funds — withdrawal skipped");
    return balance;
  }
  return balance + amount;
}

function processTransactions(startBalance, deposits, withdrawals) {
  let balance = startBalance;
  for (let d of deposits) balance = applyDeposit(balance, d);
  for (let w of withdrawals) balance = applyWithdrawal(balance, w);
  return balance;
}

const deposits = [500, 200, 150];
const withdrawals = [100, 50, 200];
const finalBalance = processTransactions(1000, deposits, withdrawals);
console.log("Final balance: $" + finalBalance.toFixed(2));
