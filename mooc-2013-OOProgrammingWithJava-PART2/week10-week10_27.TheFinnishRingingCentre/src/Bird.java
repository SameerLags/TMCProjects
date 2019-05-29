
public class Bird {

    private String name;
    private String latinName;
    private int ringingYear;

    public Bird(String name, String latinName, int ringingYear) {
        this.name = name;
        this.latinName = latinName;
        this.ringingYear = ringingYear;
    }

    public String getLatinName() {
        return latinName;
    }

    public int getRingingYear() {
        return ringingYear;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null)
            return false;
        if (this.getClass() != object.getClass())
            return false;
        Bird bird = (Bird) object;
        if (!latinName.equals(bird.getLatinName()))
            return false;
        if (ringingYear != bird.getRingingYear())
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        if (latinName.equals(""))
            return 7;
        return latinName.hashCode();
    }

    @Override
    public String toString() {
        return this.latinName + " (" + this.ringingYear + ")";
    }
}


