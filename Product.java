package cw;

public class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;

    private static int idCounter = 0;

    public Product(String name, double price, int quantity) {
        this.id = ++idCounter;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void display() {
        System.out.printf("ID: %-4d| Name: %-25s| Price: %-5.2f| Quantity: %-4d\n", id, name, price, quantity);
    }
}
