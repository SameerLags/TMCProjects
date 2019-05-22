import java.util.ArrayList;

public class Container {
    private int weightLimit;
    private ArrayList<Suitcase> suitcases = new ArrayList<Suitcase>();

    public Container(int weightLimit) {
        this.weightLimit = weightLimit;
    }

    public void addSuitcase(Suitcase suitcase) {
        int weightAfterAdding = this.totalWeight() + suitcase.totalWeight();
        if (weightAfterAdding <= this.weightLimit)
            this.suitcases.add(suitcase);
    }

    public int totalWeight() {
        int weight = 0;
        for (Suitcase s:suitcases) {
            weight += s.totalWeight();
        }
        return weight;
    }

    public void printThings() {
        for (Suitcase s:suitcases) {
            s.printThings();
        }
    }

    public String toString() {
        return suitcases.size() + " suitcases (" + totalWeight() + " kg)";
    }
}