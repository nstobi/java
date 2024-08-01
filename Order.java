package cw;

import java.util.ArrayList;

public class Order {
    private static int idCounter = 0;
    private int orderId;
    private String customerName;
    private String shippingAddress;
    private ArrayList<Product> products;

    public Order(String customerName, String shippingAddress) {
        this.orderId = ++idCounter;
        this.customerName = customerName;
        this.shippingAddress = shippingAddress;
        this.products = new ArrayList<>();
    }

    public int getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayOrder() {
        System.out.printf("Order ID: %d | Customer: %s | Address: %s\n", orderId, customerName, shippingAddress);
        for (Product product : products) {
            product.display();
        }
    }
}
