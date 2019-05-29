package containers;

public class ProductContainerRecorder extends ProductContainer{
    private ContainerHistory containerHistory;

    public ProductContainerRecorder(String productName, double capacity, double initialVolume) {
        super(productName, capacity);
        super.setVolume(initialVolume);
        containerHistory = new ContainerHistory();
        containerHistory.add(initialVolume);
    }

    public String history() {
        return "" + containerHistory;
    }

    @Override
    public void addToTheContainer(double amount) {
        super.addToTheContainer(amount);
        containerHistory.add(super.getVolume());
    }

    public double takeFromTheContainer(double amount) {
        double val = super.takeFromTheContainer(amount);
        containerHistory.add(super.getVolume());
        return val;
    }

    public void printAnalysis() {
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + containerHistory);
        System.out.println("Greatest product amount: " + containerHistory.maxValue());
        System.out.println("Smallest product amount: " + containerHistory.minValue());
        System.out.println("Average: " + containerHistory.average());
        System.out.println("Greatest change: " + containerHistory.greatestFluctuation());
        System.out.println("Variance: " + containerHistory.variance());
    }
}