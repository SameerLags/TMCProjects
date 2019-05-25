import java.util.*;

public class ShoppingBasket {
    private Map<String, Purchase> purchases;

    public ShoppingBasket() {
        this.purchases = new HashMap<String, Purchase>();
    }

    public void add(String product, int price) {
        if (!this.purchases.containsKey(product)) {
            Purchase p = new Purchase(product, 1, price);
            this.purchases.put(product, p);
        } else {
            this.purchases.get(product).increaseAmount();
        }
    }

    public int price() {
        int price = 0;
        for (Purchase p:this.purchases.values()) {
            price += p.price();
        }
        return price;
    }

    public void print() {
        for (Purchase p:this.purchases.values()) {
            System.out.println(p);
        }
    }
}