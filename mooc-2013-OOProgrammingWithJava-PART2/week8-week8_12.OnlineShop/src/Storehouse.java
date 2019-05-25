import java.util.*;

public class Storehouse {
    private Map<String, Integer> price;
    private Map<String, Integer> stock;

    public Storehouse() {
        price = new HashMap<String, Integer>();
        stock = new HashMap<String, Integer>();
    }

    public void addProduct(String product, int price, int stock) {
        this.price.put(product, price);
        this.stock.put(product, stock);
    }

    public int price(String product) {
        return this.price.getOrDefault(product, -99);
    }

    public int stock (String product) {
        return this.stock.getOrDefault(product, 0);
    }

    public boolean take(String product) {
        int stock = this.stock(product);
        if (stock == 0) {
            return false;
        } else {
            this.stock.replace(product, stock-1);
            return true;
        }
    }

    public Set<String> products() {
        return this.price.keySet();
    }
}