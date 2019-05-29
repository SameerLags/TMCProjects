package dungeon;

import java.util.*;

public class Dungeon {
    private int length;
    private int height;
    private int vampires;
    private int moves;
    private boolean vampiresMove;
    private Scanner scanner;
    private Player player;
    private List<Vampire> vamps;

    public Dungeon(int length, int height, int vampires, int moves, boolean vampiresMove) {
        this.length = length;
        this.height = height;
        this.vampires = vampires;
        this.moves = moves;
        this.vampiresMove = vampiresMove;
        scanner = new Scanner(System.in);
        player = new Player(length, height);
        vamps = new ArrayList<Vampire>();
        makeVampires();
    }

    public void makeVampires() {
        for (int i=0; i<vampires; i++) {
            int column = new Random().nextInt(length);
            int row = new Random().nextInt(height);
            vamps.add(new Vampire(column, row, length, height));
        }
    }

    public void printMoves() {
        System.out.println(moves);
    }

    public void printPositions() {
        System.out.println("@ " + player.getX() + " " + player.getY());
        for (Vampire vampire:vamps)
            System.out.println("v " + vampire.getX() + " " + vampire.getY());
    }

    public boolean playerHere(int i, int j) {
        return (i==player.getX() && j==player.getY());
    }

    public boolean vampireHere(int i, int j) {
        for (Vampire vampire:vamps) {
            if (i==vampire.getX() && j==vampire.getY())
                return true;
        }
        return false;
    }

    public void printDungeon() {
        for (int i=0; i<length; i++) {
            for (int j=0; j<height; j++) {
                if (playerHere(j,i)) {
                    System.out.print("@");
                } else if (vampireHere(j,i)) {
                    System.out.print("v");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println("");
        }
    }

    public void killVampires() {
        ArrayList<Vampire> toBeRemoved = new ArrayList<Vampire>();
        for (Vampire vampire:vamps) {
            if(vampire.getX() == player.getX() && vampire.getY() == player.getY())
                toBeRemoved.add(vampire);
        }
        vamps.removeAll(toBeRemoved);
    }

    public void run() {
        do {
            printMoves();
            System.out.println("");
            printPositions();
            System.out.println("");
            printDungeon();
            String movement = scanner.nextLine();
            int playerMoves = movement.length();
            for (int i=0; i<playerMoves; i++) {
                char vampMovement = "wasd".charAt(new Random().nextInt(4));
                player.move(movement.charAt(i));
                if (vampiresMove) {
                    for (Vampire vampire : vamps)
                        vampire.move(vampMovement);
                }
                killVampires();
            }
            moves--;
            if (vamps.size() == 0) {
                System.out.println("YOU WIN");
                break;
            }
        } while (moves > 0);
        if (moves == 0)
            System.out.println("YOU LOSE");
    }
}