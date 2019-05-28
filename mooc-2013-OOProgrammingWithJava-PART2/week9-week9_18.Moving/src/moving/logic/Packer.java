package moving.logic;

import moving.domain.Box;
import moving.domain.Thing;
import java.util.*;

public class Packer {
    private int boxVolume;
    private List<Box> boxList;

    public Packer(int boxVolume) {
        this.boxVolume = boxVolume;
        this.boxList = new ArrayList<Box>();
    }

    public List<Box> packThings(List<Thing> things) {
        Box currentBox = new Box(this.boxVolume);
        for (Thing thing:things) {
            if(!currentBox.addThing(thing)) {
                this.boxList.add(currentBox);
                currentBox = new Box(this.boxVolume);
                currentBox.addThing(thing);
            }
        }
        this.boxList.add(currentBox);
        return this.boxList;
    }
}