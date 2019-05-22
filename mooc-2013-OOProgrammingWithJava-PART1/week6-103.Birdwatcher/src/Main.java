import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void add(Scanner reader, ArrayList<Bird> birds) {
        System.out.println("Name: ");
        String name = reader.nextLine();
        System.out.println("Latin name: ");
        String latinName = reader.nextLine();
        birds.add(new Bird(name, latinName));
    }

    public static void observation(Scanner reader, ArrayList<Bird> birds) {
        System.out.println("What was observed:? ");
        String name = reader.nextLine();
        for (Bird b : birds) {
            if (b.getName().equals(name)) {
                b.observed();
            }
        }
    }

    public static void statistics(ArrayList<Bird> birds) {
        for (Bird b : birds) {
            System.out.println(b);
        }
    }

    public static void show(Scanner reader, ArrayList<Bird> birds) {
        System.out.println("What? ");
        String name = reader.nextLine();
        for (Bird b : birds) {
            if (b.getName().equals(name))
                System.out.println(b);
        }
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String choice = "";
        ArrayList<Bird> birds = new ArrayList<Bird>();

        while (true) {
            System.out.print("?");
            choice = reader.nextLine();
            
            if (choice.equals("Add")) {
                add(reader, birds);
            } else if (choice.equals("Observation")) {
                observation(reader, birds);
            } else if (choice.equals("Statistics")) {
                statistics(birds);
            } else if (choice.equals("Show")) {
                show(reader, birds);
            } else if (choice.equals("Quit")) {
                break;
            }
        }
    }
}
