import java.util.*;

public class InventoryManager {
    HashMap<Integer, Product> inventory = new HashMap<>();

    public void addProduct(Product p) {
        inventory.put(p.productId, p);
    }

    public void updateProduct(int productId, int quantity, double price) {
        if (inventory.containsKey(productId)) 
        {
            Product p = inventory.get(productId);
            p.quantity = quantity;
            p.price = price;
        } else {
            System.out.println("Product not found");
        }
    }

    public void deleteProduct(int productId) {
        inventory.remove(productId);
    }

    public void displayInventory() {
        for (Product p : inventory.values()) {
            System.out.println(p);
        }
    }

    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();
        manager.addProduct(new Product(101, "Mouse", 10, 399.99));
        manager.addProduct(new Product(102, "Keyboard", 5, 699.00));
        manager.displayInventory();

        System.out.println("\nUpdating product 101...");
        manager.updateProduct(101, 12, 379.00);
        manager.displayInventory();

        System.out.println("\nDeleting product 102...");
        manager.deleteProduct(102);
        manager.displayInventory();
    }
}
