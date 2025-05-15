import java.util.ArrayList;
import java.util.List;

public class Inventory {

    private List<Product> products; // A list to hold the products in the inventory
    private int lowStockThreshold;   // The minimum quantity for a product to be considered low stock

    // Constructor to initialize the Inventory with an empty list of products and a low stock threshold
    public Inventory(int lowStockThreshold) {
        this.products = new ArrayList<>();
        this.lowStockThreshold = lowStockThreshold;
    }

    /**
     * Adds a product to the inventory.
     *
     * @param product The Product object to be added.
     */
    public void addProduct(Product product) {
        if (product != null) {
            this.products.add(product);
            System.out.println(product.getName() + " has been added to the inventory.");
        } else {
            System.out.println("Cannot add a null product.");
        }
    }

    /**
     * Removes a product from the inventory based on its name.
     *
     * @param productName The name of the product to be removed.
     */
    public void removeProduct(String productName) {
        // Iterate through the list of products to find the product with the given name
        for (int i = 0; i < this.products.size(); i++) {
            if (this.products.get(i).getName().equalsIgnoreCase(productName)) {
                Product removedProduct = this.products.remove(i);
                System.out.println(removedProduct.getName() + " has been removed from the inventory.");
                return; // Exit the method once the product is found and removed
            }
        }
        System.out.println("Product with name '" + productName + "' not found in the inventory.");
    }

    /**
     * Checks if a product is low in stock.
     *
     * @param productName The name of the product to check.
     * @return True if the product quantity is below or equal to the low stock threshold, false otherwise.
     */
    public boolean isLowInventory(String productName) {
        for (Product product : this.products) {
            if (product.getName().equalsIgnoreCase(productName)) {
                return product.getQuantity() <= this.lowStockThreshold;
            }
        }
        System.out.println("Product with name '" + productName + "' not found in the inventory.");
        return false; // Return false if the product is not found
    }

    /**
     * Displays all products that are currently low in stock.
     */
    public void checkLowInventory() {
        System.out.println("\nChecking for low inventory (threshold: " + this.lowStockThreshold + "):");
        boolean lowStockFound = false;
        for (Product product : this.products) {
            if (product.getQuantity() <= this.lowStockThreshold) {
                System.out.println("- " + product.getName() + " (Quantity: " + product.getQuantity() + ")");
                lowStockFound = true;
            }
        }
        if (!lowStockFound) {
            System.out.println("No products are currently low in stock.");
        }
    }

    /**
     * Displays all the products currently in the inventory.
     */
    public void displayInventory() {
        if (this.products.isEmpty()) {
            System.out.println("The inventory is currently empty.");
        } else {
            System.out.println("\nCurrent Inventory:");
            for (Product product : this.products) {
                System.out.println("- " + product.getName() + " (Quantity: " + product.getQuantity() + ")");
            }
        }
    }

    public static void main(String[] args) {
        // Create a new Inventory object with a low stock threshold of 5
        Inventory inventory = new Inventory(5);

        // Create some Product objects
        Product product1 = new Product("Laptop", 10);
        Product product2 = new Product("Mouse", 3);
        Product product3 = new Product("Keyboard", 8);
        Product product4 = new Product("Monitor", 5);

        // Add products to the inventory
        inventory.addProduct(product1);
        inventory.addProduct(product2);
        inventory.addProduct(product3);
        inventory.addProduct(product4);
        inventory.addProduct(null); // Try adding a null product

        // Display the current inventory
        inventory.displayInventory();

        // Check if a product is low in stock
        System.out.println("\nIs Mouse low in stock? " + inventory.isLowInventory("Mouse"));
        System.out.println("Is Laptop low in stock? " + inventory.isLowInventory("Laptop"));
        System.out.println("Is Printer low in stock? " + inventory.isLowInventory("Printer")); // Check for a non-existent product

        // Check for all low inventory products
        inventory.checkLowInventory();

        // Remove a product
        inventory.removeProduct("Mouse");

        // Display the inventory after removal
        inventory.displayInventory();

        // Check low inventory again
        inventory.checkLowInventory();
    }
}

// A simple Product class to represent a product with a name and quantity
class Product {
    private String name;
    private int quantity;

    public Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}