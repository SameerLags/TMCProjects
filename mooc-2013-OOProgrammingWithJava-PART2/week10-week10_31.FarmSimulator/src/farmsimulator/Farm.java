package farmsimulator;

import java.util.*;

public class Farm implements Alive{
    private String owner;
    private Barn barn;
    private List<Cow> cows;

    public Farm(String owner, Barn barn) {
        this.owner = owner;
        this.barn = barn;
        this.cows = new ArrayList<Cow>();
    }

    public void addCow(Cow cow) {
        cows.add(cow);
    }

    public void liveHour() {
        for (Cow cow:cows) {
            cow.liveHour();
        }
    }

    public String getOwner() {
        return owner;
    }

    public void manageCows() {
        for (Cow cow:cows) {
            barn.takeCareOf(cow);
        }
    }

    public void installMilkingRobot(MilkingRobot milkingRobot) {
        barn.installMilkingRobot(milkingRobot);
    }

    public String toString() {
        String cowDetails = "Animals:";
        if (cows.size() == 0)
            cowDetails = "No cows.";
        else {
            for (Cow cow:cows) {
                cowDetails += "\n        " + cow;
            }
        }

        return "Farm owner: " + owner +
                "\nBarn bulk tank: " + barn.getBulkTank() +
                cowDetails;
    }
}