
public class Main {

    public static void main(String[] args) {

    }

    public static void addSuitcasesFullOfBricks(Container container) {
        for (int i=1; i<=100; i++) {
            Thing brick = new Thing("Brick", i);
            Suitcase suitcase = new Suitcase(100);
            suitcase.addThing(brick);
            container.addSuitcase(suitcase);
        }
    }
}
