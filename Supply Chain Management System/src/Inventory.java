
import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<String, Integer> stock;

    public Inventory() {
        stock = new HashMap<>();
    }

    public void addStock(String productId, int quantity) {
        stock.put(productId, quantity);
    }

    public int getStock(String productId) {
        return stock.getOrDefault(productId, 0);
    }

    @Override
    public String toString() {
        return "Inventory [stock=" + stock + "]";
    }
}
