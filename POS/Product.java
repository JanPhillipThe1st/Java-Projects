package POS;
 
public class Product {
    private String name;
    private double price;
    private int quantity;
    private double total;
 
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.total = price * quantity;
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
 
    public double getTotal() {
        return total;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public void setPrice(double price) {
        this.price = price;
    }
 
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
 
    public void setTotal(double total) {
        this.total = total;
    }
 
    public String toString() {
        return "Product [name=" + name + ", price=" + price + ", quantity=" + quantity + ", total=" + total + "]";
    }
}