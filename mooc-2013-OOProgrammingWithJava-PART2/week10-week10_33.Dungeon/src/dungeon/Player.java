package dungeon;

public class Player extends Movable {
    private int xMax;
    private int yMax;

    public Player(int length, int height) {
        setX(0);
        setY(0);
        this.yMax = height-1;
        this.xMax = length-1;
    }

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