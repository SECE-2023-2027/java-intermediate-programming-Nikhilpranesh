import java.util.Scanner;

class Product {
    private String productId;
    private String productName;
    private double price;
    private int stockQuantity;

    // Constructor
    public Product(String productId, String productName, double price, int stockQuantity) {
        this.productId = productId;
        this.productName = productName;

        // simple validation
        this.price = (price < 0) ? 0.0 : price;
        this.stockQuantity = (stockQuantity < 0) ? 0 : stockQuantity;
    }

    // Getters
    public double getPrice() {
        return price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    // Setters (only where needed)
    public void setPrice(double price) {
        this.price = (price < 0) ? 0.0 : price;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = (stockQuantity < 0) ? 0 : stockQuantity;
    }

    // Apply discount
    public void applyDiscount(double percentage) {
        if (percentage > 0) {
            price -= price * percentage / 100;
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product details:");

        System.out.print("ID: ");
        String id = sc.nextLine();

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Price: ");
        double price = sc.nextDouble();

        System.out.print("Stock: ");
        int stock = sc.nextInt();

        System.out.print("Discount (%): ");
        double discount = sc.nextDouble();

        // create product
        Product product = new Product(id, name, price, stock);

        // apply discount
        product.applyDiscount(discount);

        // show result
        System.out.println("\nAfter discount:");
        System.out.println("Price = " + product.getPrice());
        System.out.println("Stock = " + product.getStockQuantity());

        sc.close();
    }
}