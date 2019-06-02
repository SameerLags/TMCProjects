package wormgame.game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.Timer;
import wormgame.Direction;
import wormgame.gui.Updatable;
import wormgame.domain.*;

public class WormGame extends Timer implements ActionListener {

    private int width;
    private int height;
    private boolean continues;
    private Updatable updatable;
    private Worm worm;
    private Apple apple;

    public WormGame(int width, int height) {
        super(1000, null);

        this.width = width;
        this.height = height;
        this.continues = true;
        this.worm = new Worm(width/2, height/2, Direction.DOWN);

        addActionListener(this);
        setInitialDelay(2000);

        createApple();
    }

    public Worm getWorm() {
        return worm;
    }

    public Apple getApple() {
        return apple;
    }

    public void createApple() {
        Random random = new Random();
        while (true) {
            int appleX = random.nextInt(width);
            int appleY = random.nextInt(height);
            this.apple = new Apple(appleX, appleY);
            if (!worm.runsInto(apple))
                break;
        }
    }

    public void setWorm(Worm worm) {
        this.worm = worm;
    }

    public void setApple(Apple apple) {
        this.apple = apple;
    }

    public boolean continues() {
        return continues;
    }

    public void setUpdatable(Updatable updatable) {
        this.updatable = updatable;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (!continues) {
            return;
        }

        worm.move();
        if (worm.runsInto(apple)) {
            createApple();
            worm.grow();
        }

        if (worm.runsIntoItself())
            continues = false;
        if (worm.runsIntoBorder(height, width))
            continues = false;

        updatable.update();
        setDelay(1000/worm.getLength());
    }
}
