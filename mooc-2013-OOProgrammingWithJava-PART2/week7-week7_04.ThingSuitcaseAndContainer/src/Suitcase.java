import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Thing> things;
    private int weightLimit;

    public Suitcase(int weightLimit) {
        this.things = new ArrayList<Thing>();
        this.weightLimit = weightLimit;
    }

    public void addThing(Thing thing) {
        int weightAfterAdd = totalWeight() + thing.getWeight();
        if( weightAfterAdd <= this.weightLimit)
            this.things.add(thing);
    }

    public void printThings() {
        for (Thing t:things) {
            System.out.println(t);
        }
    }

    public int totalWeight() {
        int weight = 0;
        for (Thing t:things) {
            weight += t.getWeight();
        }
        return weight;
    }

    public Thing heaviestThing() {
        if(this.things.size() == 0) return null;
        int maxWeight = 0;
        Thing heaviestThing = new Thing();
        for (Thing t:things) {
            int weight = t.getWeight();
            if (maxWeight < weight) {
                maxWeight = weight;
                heaviestThing = t;
            }
        }
        return heaviestThing;
    }

    public String toString() {
        String count = "";
        int size = this.things.size();
        if (this.things.size() == 0) {
            count = "empty (";
        } else if (this.things.size() == 1) {
            count = "1 thing (";
        } else {
            count = size + " things (";
        }
        return count + totalWeight() + " kg)";
    }
}