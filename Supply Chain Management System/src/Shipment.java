public class Shipment {
    private String shipmentId;
    private String orderId;
    private String shipmentStatus;

    public Shipment(String shipmentId, String orderId) {
        this.shipmentId = shipmentId;
        this.orderId = orderId;
        this.shipmentStatus = "In Transit";
    }

    public String getShipmentId() {
        return shipmentId;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getShipmentStatus() {
        return shipmentStatus;
    }

    public void setShipmentStatus(String shipmentStatus) {
        this.shipmentStatus = shipmentStatus;
    }

    @Override
    public String toString() {
        return "Shipment [shipmentId=" + shipmentId + ", orderId=" + orderId + ", shipmentStatus=" + shipmentStatus + "]";
    }
}
