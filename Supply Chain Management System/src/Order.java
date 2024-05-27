public class Order {
    private String orderId;
    private String productId;
    private int quantity;
    private String status;

    public Order(String orderId, String productId, int quantity, String status) {
        this.orderId = orderId;
        this.productId = productId;
        this.quantity = quantity;
        this.status = status;
    }
    public String getOrderId() {
        return orderId;
    }
    public String getProductId() {
        return productId;
    }
    public int getQuantity() {
        return quantity;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order [orderId=" + orderId + ", productId=" + productId + ", quantity=" + quantity + ", status=" + status + "]";
    }
}
