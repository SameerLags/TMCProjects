package farmsimulator;

public class MilkingRobot {
    private BulkTank bulkTank;

    public MilkingRobot() {
    }

    public BulkTank getBulkTank() {
        return bulkTank;
    }

    public void setBulkTank(BulkTank tank) {
        this.bulkTank = tank;
    }

    public void milk(Milkable milkable) {
        try {
            bulkTank.addToTank(milkable.milk());
        }
        catch (Exception e) {
            throw new IllegalStateException("The BulkTank hasn't been installed");
        }
    }
}