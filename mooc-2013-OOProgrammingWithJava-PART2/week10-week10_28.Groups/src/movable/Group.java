package movable;

import java.util.*;

public class Group implements Movable{
    private List<Movable> groupMembers;

    public Group() {
        groupMembers = new ArrayList<Movable>();
    }

    public void addToGroup(Movable movable) {
        groupMembers.add(movable);
    }

    public void move(int dx, int dy) {
        for (Movable member:groupMembers) {
            member.move(dx,dy);
        }
    }

    public String toString() {
        String movements = "";
        for (Movable member:groupMembers) {
            movements += member + "\n";
        }
        return movements;
    }
}