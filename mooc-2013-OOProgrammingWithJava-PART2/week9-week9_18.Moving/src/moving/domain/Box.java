package moving.domain;

import java.util.*;

public class Box implements Thing{
    private int maxCap;
    private List<Thing> things;

    public Box(int maxCap) {
        this.maxCap = maxCap;
        this.things = new ArrayList<Thing>();
    }

    public int getVolume() {
        int volume = 0;
        for (Thing thing:this.things) {
            volume += thing.getVolume();
        }
        return volume;
    }

    public boolean addThing(Thing thing) {
        if (thing.getVolume() + this.getVolume() <= this.maxCap) {
            this.things.add(thing);
            return true;
        }
        return false;
    }
}