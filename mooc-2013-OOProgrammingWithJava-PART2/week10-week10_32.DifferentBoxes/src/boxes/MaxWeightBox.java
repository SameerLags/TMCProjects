package boxes;

import java.util.*;

public class MaxWeightBox extends Box{
    private int maxWeight;
    private List<Thing> things;

    public MaxWeightBox(int maxWeight) {
        this.maxWeight = maxWeight;
        this.things = new ArrayList<Thing>();
    }

    public int weight() {
        int weight = 0;
        for (Thing thing:things) {
            weight += thing.getWeight();
        }
        return weight;
    }

    public void add(Thing thing) {
        if (weight() + thing.getWeight() <= maxWeight)
            things.add(thing);
    }
    
    public boolean isInTheBox(Thing thing) {
        return things.contains(thing);
    } 
}