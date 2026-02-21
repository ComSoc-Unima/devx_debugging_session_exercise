/*
 * SCENARIO: A payroll module calculates net pay for employees after tax deductions and overtime. The net pay figures are wrong for multiple employees.
 * TASK: Set breakpoints at each function entry point and watch the values transform. There are THREE bugs across the call chain — find all of them.
 * EXPECTED OUTPUT:
 * Alice: Net pay = $724.00
 * Bob:   Net pay = $513.00
 */

function getOvertimePay(hourlyRate, hoursWorked) {
  const regularHours  = Math.min(hoursWorked, 40);
  const overtimeHours = Math.max(hoursWorked - 40, 0);
  const regularPay    = hourlyRate * regularHours;
  const overtimePay   = hourlyRate * overtimeHours;   
  return regularPay + overtimePay;
}

function calculateTax(grossPay) {
  if (grossPay < 500)  return grossPay * 0.10;
  if (grossPay < 1000) return grossPay * 0.20;
  return grossPay * 0.20;                             
}

function calculateNetPay(hourlyRate, hoursWorked) {
  const gross = getOvertimePay(hourlyRate, hoursWorked);
  const tax   = calculateTax(gross);
  return gross + tax;                                 
}

function printPayslip(name, hourlyRate, hoursWorked) {
  const net = calculateNetPay(hourlyRate, hoursWorked);
  console.log(`${name}: Net pay = $${net.toFixed(2)}`);
}

printPayslip('Alice', 20, 45);  
printPayslip('Bob',   15, 38);  