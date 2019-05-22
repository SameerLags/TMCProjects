public class Product {
    private double price;
    private int amount;
    private String name;

    public Product(String nameAtStart, double priceAtStart, int amountAtStart) {
        this.price = priceAtStart;
        this.amount = amountAtStart;
        this.name = nameAtStart;
    }

    public void printProduct() {
        System.out.println(this.name+", price "+this.price+", amount "+this.amount);
    }
}