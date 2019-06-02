package wormgame.gui;

import wormgame.game.*;
import wormgame.domain.*;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;

public class DrawingBoard extends JPanel implements Updatable{
    private WormGame wormGame;
    private int pieceLength;

    public DrawingBoard(WormGame wormGame, int pieceLength) {
        this.wormGame = wormGame;
        this.pieceLength = pieceLength;
        super.setBackground(Color.GRAY);
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        Apple apple = wormGame.getApple();
        Worm worm = wormGame.getWorm();

        apple.draw(graphics, pieceLength, 1);
        worm.draw(graphics, pieceLength);
    }

    public void update() {
        this.repaint();
    }
}