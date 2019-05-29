package boxes;

public class OneThingBox extends Box{
    private Thing thing;

    public void add(Thing thing) {
        if (this.thing == null)
            this.thing = thing;
    }

    public boolean isInTheBox(Thing thing) {
        if (this.thing != null)
            return this.thing.equals(thing);
        return false;
    }
}