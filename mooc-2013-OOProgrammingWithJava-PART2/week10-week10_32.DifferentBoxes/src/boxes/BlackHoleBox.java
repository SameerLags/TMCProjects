package boxes;

import java.util.*;

public class BlackHoleBox extends Box{
    private List<Thing> things;

    public BlackHoleBox() {
        this.things = new ArrayList<Thing>();
    }
    public void add(Thing thing) {
        things.add(thing);
    }

    public boolean isInTheBox(Thing thing) {
        return false;
    }
}