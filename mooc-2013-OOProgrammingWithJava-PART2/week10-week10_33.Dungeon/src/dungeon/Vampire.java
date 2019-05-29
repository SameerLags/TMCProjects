package dungeon;

import java.util.Random;

public class Vampire extends Movable {
    private int xMax;
    private int yMax;

    public Vampire(int column, int row, int length, int height) {
        setX(column);
        setY(row);
        this.yMax = height-1;
        this.xMax = length-1;
    }

//    public String generateMovement(int moves) {
//        int moves = 1+new Random.nextInt(moves-1);
//        String moves = "wasd";
//        String movement = "";
//        for (int i=0; i<moves; i++) {
//            movement += moves.charAt(new Random.nextInt(3));
//        }
//        return movement;
//    }

    public void moveUp() {
        if (getY()-1 < 0)
            setY(0);
        else
            setY(getY()-1);
    }

    public void moveLeft() {
        if (getX()-1 < 0)
            setX(0);
        else
            setX(getX()-1);
    }

    public void moveDown() {
        if (getY()+1 > yMax)
            setY(yMax);
        else
            setY(getY()+1);
    }

    public void moveRight() {
        if (getX()+1 > xMax)
            setX(xMax);
        else
            setX(getX()+1);
    }

    @Override
    public void move(char movement) {
        switch (movement) {
            case 'w': moveUp();
            break;
            case 'a': moveLeft();
            break;
            case 's': moveDown();
            break;
            case 'd': moveRight();
        }
    }
}