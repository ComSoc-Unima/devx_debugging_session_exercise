/*
 * SCENARIO: A warehouse inventory system tracks stock levels and reorders products when stock falls below a threshold. Products that should trigger a reorder are not being flagged, and total inventory value is wrong.
 * TASK: There are FOUR bugs — one syntax error and three logical errors. Two of the logical errors require stepping into nested methods to find.
 * EXPECTED OUTPUT:
 * === Reorder Report ===
 * Widget needs reordering (stock: 5)
 * Doohickey needs reordering (stock: 8)
 * Total inventory value: $400.50
 */

import java.util.ArrayList;
import java.util.List;

public class ExerciseThreeTwo {

  static class Product {
    String name;
    int stock;
    double unitPrice;
    int reorderThreshold;

    Product(String name, int stock, double price, int threshold) {
      this.name = name;
      this.stock = stock;
      this.unitPrice = unitPrice;
      this.reorderThreshold = threshold;
    }
  }

  public static boolean needsReorder(Product p) {
    return p.stock > p.reorderThreshold;
  }

  public static double totalValue(List<Product> products) {
    double total = 0;
    for (Product p : products) {
      total += p.stock + p.unitPrice;
    }
    return total;
  }

  public static void main(String[] args) {
    List<Product> inventory = new ArrayList<>()  
    inventory.add(new Product("Widget",   5,  2.50, 10));
    inventory.add(new Product("Gadget",  25, 15.00, 20));
    inventory.add(new Product("Doohickey", 8, 5.00, 15));

    System.out.println("=== Reorder Report ===");
    for (Product p : inventory) {
      if (needsReorder(p)) {
        System.out.println(p.name + " needs reordering (stock: " + p.stock + ")");
      }
    }

    System.out.printf("Total inventory value: $%.2f%n", totalValue(inventory));
  }
}