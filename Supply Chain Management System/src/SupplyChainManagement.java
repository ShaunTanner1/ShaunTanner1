
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SupplyChainManagement {
    private List<Supplier> suppliers;
    private List<Product> products;
    private Inventory inventory;
    private List<Order> orders;
    private List<Shipment> shipments;

    public SupplyChainManagement() {
        suppliers = new ArrayList<>();
        products = new ArrayList<>();
        inventory = new Inventory();
        orders = new ArrayList<>();
        shipments = new ArrayList<>();
    }

    public void addSupplier(Supplier supplier) {
        suppliers.add(supplier);
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void addStock(String productId, int quantity) {
        inventory.addStock(productId, quantity);
    }


    public void createOrder(Order order) {
        orders.add(order);
    }

    public void createShipment(Shipment shipment) {
        shipments.add(shipment);
    }

    public void listSuppliers() {
        for (Supplier supplier : suppliers) {
            System.out.println(supplier);
        }
    }

    public void listProducts() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public void listOrders() {
        for (Order order : orders) {
            System.out.println(order);
        }
    }

    public void listShipments() {
        for (Shipment shipment : shipments) {
            System.out.println(shipment);
        }
    }

    public void listInventory() {
        System.out.println(inventory);
    }

    public static void main(String[] args) {
        SupplyChainManagement scm = new SupplyChainManagement();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Supplier");
            System.out.println("2. Add Product");
            System.out.println("3. Add Stock");
            System.out.println("4. Create Order");
            System.out.println("5. Create Shipment");
            System.out.println("6. List Suppliers");
            System.out.println("7. List Products");
            System.out.println("8. List Orders");
            System.out.println("9. List Shipments");
            System.out.println("10. List Inventory");
            System.out.println("11. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter supplier ID: ");
                    String supplierId = scanner.nextLine();
                    System.out.print("Enter supplier name: ");
                    String supplierName = scanner.nextLine();
                    System.out.print("Enter supplier contact info: ");
                    String supplierContactInfo = scanner.nextLine();
                    Supplier supplier = new Supplier(supplierId, supplierName, supplierContactInfo);
                    scm.addSupplier(supplier);
                    break;
                case 2:
                    System.out.print("Enter product ID: ");
                    String productId = scanner.nextLine();
                    System.out.print("Enter product name: ");
                    String productName = scanner.nextLine();
                    System.out.print("Enter supplier ID: ");
                    String productSupplierId = scanner.nextLine();
                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine();
                    Product product = new Product(productId, productName, productSupplierId, price);
                    scm.addProduct(product);
                    break;
                case 3:
                    System.out.print("Enter product ID: ");
                    String stockProductId = scanner.nextLine();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine();
                    scm.addStock(stockProductId, quantity);
                    break;
                case 4:
                    System.out.print("Enter order ID: ");
                    String orderId = scanner.nextLine();
                    System.out.print("Enter product ID: ");
                    String orderProductId = scanner.nextLine();
                    System.out.print("Enter quantity: ");
                    int orderQuantity = scanner.nextInt();
                    scanner.nextLine();
                    Order order = new Order(orderId, orderProductId, orderQuantity, "Pending");
                    scm.createOrder(order);
                    break;
                case 5:
                    System.out.print("Enter shipment ID: ");
                    String shipmentId = scanner.nextLine();
                    System.out.print("Enter order ID: ");
                    String shipmentOrderId = scanner.nextLine();
                    Shipment shipment = new Shipment(shipmentId, shipmentOrderId);
                    scm.createShipment(shipment);
                    break;
                case 6:
                    scm.listSuppliers();
                    break;
                case 7:
                    scm.listProducts();
                    break;
                case 8:
                    scm.listOrders();
                    break;
                case 9:
                    scm.listInventory();
                    break;
                case 10:
                    scm.listShipments();
                    break;
                case 11:
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice.");

            }
        }

    }
}
