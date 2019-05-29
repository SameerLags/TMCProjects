package boxes;

public class Thing {

    private String name;
    private int weight;

    public Thing(String name, int weight) throws IllegalArgumentException{
        if (weight < 0) {
            throw new IllegalArgumentException("Weight can't be negative.");
        }
        this.name = name;
        this.weight = weight;
    }

    public Thing(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public boolean equals(Object object) {
        if (object == null)
            return false;
        if (this.getClass() != object.getClass())
            return false;
        Thing thing = (Thing) object;
        return name.equals(thing.getName());
    }

    public int hashCode() {
        if (name.equals(""))
            return 7;
        return name.hashCode();
    }
}