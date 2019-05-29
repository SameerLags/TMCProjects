package farmsimulator;

import java.util.Collection;

public class Barn {
    private BulkTank bulkTank;
    private MilkingRobot milkingRobot;

    public Barn(BulkTank bulkTank) {
        this.bulkTank = bulkTank;
    }

    public BulkTank getBulkTank() {
        return bulkTank;
    }

    public void installMilkingRobot(MilkingRobot milkingRobot) {
        this.milkingRobot = milkingRobot;
        this.milkingRobot.setBulkTank(bulkTank);
    }

    public void takeCareOf(Cow cow) {
        try {
            milkingRobot.milk(cow);
        } catch (Exception e) {
            throw new IllegalStateException("The MilkingRobot hasn't been installed");
        }
    }

    public void takeCareOf(Collection<Cow> cows) {
        try {
            for (Cow cow:cows) {
                milkingRobot.milk(cow);
            }
        } catch (Exception e) {
            throw new IllegalStateException("The MilkingRobot hasn't been installed");
        }
    }

    public String toString() {
        return "Barn: " + bulkTank;
    }
}