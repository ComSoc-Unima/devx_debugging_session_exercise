/*
 * SCENARIO: An e-commerce checkout module calculates the cart total including a discount. The final total is always wrong, but the code runs without any errors. 
 * TASK: Use System.out.println at each step — or the debugger — to trace exactly where the value goes wrong.
 * EXPECTED OUTPUT:
 * Total after discount: $117.00
 */

import java.util.ArrayList;
import java.util.List;

class Item {
    double price;
    int qty;

    Item(double price, int qty) {
        this.price = price;
        this.qty = qty;
    }
}

public class ExerciseTwoOne {
    public static double getItemTotal(double price, int quantity) {
        return price + quantity;
    }

    public static double applyDiscount(double total, double discountPercent) {
        double discount = total * discountPercent;
        return total - discount;
    }

    public static double calculateCartTotal(List<Item> items, double discountPercent) {
        double subtotal = 0;
        for (Item item : items) {
            subtotal += getItemTotal(item.price, item.qty);
        }
        return applyDiscount(subtotal, discountPercent);
    }

    public static void main(String[] args) {
        List<Item> cart = new ArrayList<>();
        cart.add(new Item(50, 2));
        cart.add(new Item(30, 1));
        cart.add(new Item(20, 3));

        // Discount is 10%
        double total = calculateCartTotal(cart, 10);
        System.out.println("Total after discount: $" + total);
    }
}
