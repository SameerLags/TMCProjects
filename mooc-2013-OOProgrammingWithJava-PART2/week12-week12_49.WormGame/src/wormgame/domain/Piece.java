package wormgame.domain;

import java.awt.Graphics;
import java.awt.Color;

public class Piece {
    private int x, y;

    public Piece(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean runsInto(Piece piece) {
        if (x == piece.getX() && y == piece.getY())
            return true;
        return false;
    }

    public void draw(Graphics graphics, int pieceLength, int shape) {
        if (shape == 0) {
            graphics.setColor(Color.BLACK);
            graphics.fill3DRect(x*pieceLength, y*pieceLength, pieceLength, pieceLength, true);
        } else if (shape == 1) {
            graphics.setColor(Color.RED);
            graphics.fillOval(getX()*pieceLength, getY()*pieceLength, pieceLength, pieceLength);
        }
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }
}