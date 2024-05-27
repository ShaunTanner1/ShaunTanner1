public class Product {
    private String id;
    private String name;
    private String supplierId;
    private double price;

    public Product(String id, String name, String supplierId, double price) {
        this.id = id;
        this.name = name;
        this.supplierId = supplierId;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", supplierId=" + supplierId + ", price=" + price + "]";
    }
}
