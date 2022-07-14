package POS;

public class Cart {
    private Product[] products;
    private int size;
    private double total;

    public void setProducts(Product[] products) {
        this.products = products;
    }
    public Product[] getProducts() {
        return products;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public int getSize() {
        return size;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    public double getTotal() {
        return total;
    }
    public void addProduct(Product product) {
        if (size == 0) {
            products = new Product[1];
            products[0] = product;
            size++;
        } else {
            Product[] temp = new Product[size + 1];
            for (int i = 0; i < size; i++) {
                temp[i] = products[i];
            }
            temp[size] = product;
            products = temp;
            size++;
        }
    }
}
