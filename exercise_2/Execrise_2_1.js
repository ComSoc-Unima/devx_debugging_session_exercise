/*
 * SCENARIO: An e-commerce checkout module calculates the cart total including a discount. The final total is always wrong, but the code runs without any errors. 
 * TASK: Use console.log at each step — or the VS Code debugger — to trace exactly where the value goes wrong.
 * EXPECTED OUTPUT:
 * Total after discount: $117.00
 */

function getItemTotal(price, quantity) {
  return price + quantity;           
}

function applyDiscount(total, discountPercent) {
  const discount = total * discountPercent;  
  return total - discount;
}

function calculateCartTotal(items, discountPercent) {
  let subtotal = 0;
  for (const item of items) {
    subtotal += getItemTotal(item.price, item.qty);
  }
  return applyDiscount(subtotal, discountPercent);
}

const cart = [
  { price: 50,  qty: 2 },
  { price: 30,  qty: 1 },
  { price: 20,  qty: 3 },
];

// Discount is 10%
const total = calculateCartTotal(cart, 10);
console.log('Total after discount: $' + total);