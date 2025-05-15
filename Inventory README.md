# Simple Inventory Management System in Java

This repository contains a basic Java program that simulates a simple inventory management system. It includes two main classes: `Inventory` to manage a collection of products and `Product` to represent individual products.

## Overview

The system consists of two main classes:

-   **`Inventory`**: This class manages a collection of `Product` objects. It provides functionalities to:
    -   Add a new product to the inventory.
    -   Remove a product from the inventory based on its name.
    -   Check if a product is low in stock.
    -   Display all products that are currently low in stock.
    -   Display all the products currently in the inventory.
-   **`Product`**: This class represents a product with a name and quantity.

The `main` method within the `Inventory` class demonstrates the usage of these functionalities by creating an inventory, adding some products, displaying them, checking for low stock, removing a product, and then displaying the updated inventory.

## Getting Started

To run this program, you need to have Java Development Kit (JDK) installed on your system.

1.  **Save the code:** Save the provided Java code into two files: `Inventory.java` and `Product.java` in the same directory.
2.  **Compile the code:** Open your terminal or command prompt, navigate to the directory where you saved the files, and compile the Java files using the following command:

    ```bash
    javac Inventory.java Product.java
    ```

    This will generate `Inventory.class` and `Product.class` files.
3.  **Run the program:** Execute the `Inventory` class using the following command:

    ```bash
    java Inventory
    ```

    This will run the `main` method in the `Inventory` class and you will see the output in your console.

## Functionality

### Creating an Inventory Object

The `Inventory` class constructor initializes a new inventory with a specified low stock threshold.

```java
public Inventory(int lowStockThreshold) {
    this.products = new ArrayList<>();
    this.lowStockThreshold = lowStockThreshold;
}
```

**Usage:**

```java
Inventory inventory = new Inventory(5); // Creates an inventory where products with quantity <= 5 are considered low stock.
```

### Adding Products

The `addProduct(Product product)` method adds a `Product` object to the inventory's collection. It checks if the provided product is not null before adding it.

```java
public void addProduct(Product product) {
    if (product != null) {
        this.products.add(product);
        System.out.println(product.getName() + " has been added to the inventory.");
    } else {
        System.out.println("Cannot add a null product.");
    }
}
```

**Usage:**

```java
Product laptop = new Product("Laptop", 10);
inventory.addProduct(laptop);
```

### Removing Products

The `removeProduct(String productName)` method removes a product from the inventory based on its name. It iterates through the list of products and removes the first product it finds with a matching name (case-insensitive).

```java
public void removeProduct(String productName) {
    for (int i = 0; i < this.products.size(); i++) {
        if (this.products.get(i).getName().equalsIgnoreCase(productName)) {
            Product removedProduct = this.products.remove(i);
            System.out.println(removedProduct.getName() + " has been removed from the inventory.");
            return; // Exit the method once the product is found and removed
        }
    }
    System.out.println("Product with name '" + productName + "' not found in the inventory.");
}
```

**Usage:**

```java
inventory.removeProduct("Mouse");
```

### Checking Low Inventory for a Single Product

The `isLowInventory(String productName)` method checks if the quantity of a specific product is below or equal to the low stock threshold.

```java
public boolean isLowInventory(String productName) {
    for (Product product : this.products) {
        if (product.getName().equalsIgnoreCase(productName)) {
            return product.getQuantity() <= this.lowStockThreshold;
        }
    }
    System.out.println("Product with name '" + productName + "' not found in the inventory.");
    return false; // Return false if the product is not found
}
```

**Usage:**

```java
if (inventory.isLowInventory("Keyboard")) {
    System.out.println("Keyboard is low in stock.");
} else {
    System.out.println("Keyboard is not low in stock.");
}
```

### Checking for All Low Inventory Products

The `checkLowInventory()` method displays all products in the inventory that are currently low in stock.

```java
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
```

**Usage:**

```java
inventory.checkLowInventory();
```

### Displaying the Inventory

The `displayInventory()` method displays all the products currently in the inventory, showing their names and quantities.

```java
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
```

**Usage:**

```java
inventory.displayInventory();
```

## `Product` Class

The `Product` class is a simple representation of a product with a name and quantity.

```java
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
```

## Example Usage

The `main` method in the `Inventory` class demonstrates how to use the `Inventory` and `Product` classes:

```java
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
```

## Potential Enhancements

  - **Update Product Quantity:** Add a method to update the quantity of an existing product.
  - **Add Quantity to Product:** Add a method to increase the quantity of an existing product.
  - **Product Categories:** Add a category attribute to the `Product` class and methods to manage products by category.
  - **Reordering:** Implement automatic reordering functionality when a product falls below the low stock threshold.
  - **Data Persistence:** Implement saving and loading the inventory data to a file or database.
  - **User Interface:** Develop a command-line interface (CLI) or a graphical user interface (GUI) for easier interaction.
  - **Exception Handling:** Implement more robust error handling (e.g., for invalid input).

## Author

Durjoy Barua / https://github.com/iamdurjoybarua
