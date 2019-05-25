import java.util.ArrayList;

public class Box implements ToBeStored{
    private ArrayList<ToBeStored> itemList;
    private double maxWeight;

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        itemList = new ArrayList<ToBeStored>();
    }

    public void add(ToBeStored toBeStored) {
        if (this.weight() + toBeStored.weight() <= this.maxWeight)
            this.itemList.add(toBeStored);
    }

    public double weight() {
        double weight = 0;
        for (ToBeStored item:itemList) {
            weight += item.weight();
        }
        return weight;
    }

    public String toString() {
        return "Box: " + this.itemList.size() + " things, total weight " + this.weight() + " kg";
    }
}