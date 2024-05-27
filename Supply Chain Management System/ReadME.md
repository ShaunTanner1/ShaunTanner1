# Supply Chain Management System (SCMS)

This is a console-based application that allows you to manage the supply chain of a company. It provides features such as adding suppliers, products, creating orders, and shipping orders.

## Features
- **Supplier Management**: Add, edit, and delete suppliers.
- **Product Management**: Add, edit, and delete products.
- **Order Management**: Create, edit, and delete orders.
- **Shipment Management**: Create, edit, and delete shipments.
- **Inventory Management**: Add, edit, and delete inventory.

## Project Structure

src/
├── Main.java
├── Supplier.java
├── Product.java
├── Inventory.java
├── Order.java
├── Shipment.java
├── SupplyChainManagement.java

## Classes and Methods

### 'Supplier'

Represents a supplier in the supply chain management system. It contains information such as the supplier's ID, name, and contact information.

#### Fields
-'String id'
-'String name'
-'String contactInfo'

#### Methods
-'Supplier(String id, String name, String contactInfo)'
-'String getId()'
-'String getName()'
-'String getContactInfo()'
-'String toString()'

### 'Product'

Represents a product in the supply chain management system. It contains information such as the product's ID, name, supplier ID, and price.

#### Fields
-'String id'
-'String name'
-'String supplierId'
-'double price'

#### Methods
-'Product(String id, String name, String supplierId, double price)'
-'String getId()'
-'String getName()'
-'String getSupplierId()'
-'double getPrice()'
-'String toString()'

### 'Inventory'

Represents an inventory in the supply chain management system. It contains information such as the inventory's ID, product ID, and quantity.

#### Fields
- 'Map<String, Integer> stock'

#### Methods
-'voidaddStock(String productId, int quantity)'
-'int getStock(String productId)'
-'StringtoString()'

### 'Order'

Represents an order in the supply chain management system. It contains information such as the order's ID, product ID, quantity, and status.

#### Fields
-'String orderId'
-'String productId'
-'int quantity'
-'String status'

#### Methods
-'Order(String orderId, String productId, int quantity, String status)'
-'String getOrderId()'
-'String getProductId()'
-'int getQuantity()'
-'String getStatus()'
-'void setStatus(String status)'
-'String toString()'

### 'Shipment'

Represents a shipment in the supply chain management system. It contains information such as the shipment's ID, order ID, and status.

#### Fields
-'String shipmentId'
-'String orderId'
-'String status'

#### Methods
-'Shipment(String shipmentId, String orderId, String status)'
-'String getShipmentId()'
-'String getOrderId()'
-'String getStatus()'
-'void setStatus(String status)'
-'String toString()'

### 'SupplyChainManagement'

Represents the supply chain management system. It contains methods for managing suppliers, products, orders, and shipments.

#### Fields
-'List<Supplier> suppliers'
-'List<Product> products'
-'Inventory inventory'
-'List<Order> orders'
-'List<Shipment> shipments'

#### Methods
-'SupplyChainManagement()'
-'void addSupplier(Supplier supplier)'
-'void addProduct(Product product)'
-'void addOrder(Order order)'
-'void addShipment(Shipment shipment)'
-'void manageInventory()'


## Future Enhancements:
- Data Persistence
- User Authentication
- Enhanced UI
- Reports and Analytics