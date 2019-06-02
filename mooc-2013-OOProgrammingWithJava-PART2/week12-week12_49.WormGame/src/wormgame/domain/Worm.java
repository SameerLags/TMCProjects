package wormgame.domain;

import wormgame.*;
import java.util.*;
import java.awt.Graphics;
import wormgame.Direction;

public class Worm {
    private int x, y;
    private Direction direction;
    private List<Piece> pieces;
    private boolean grow;

    public Worm(int originalX, int originalY, Direction originalDirection) {
        this.x = originalX;
        this.y = originalY;
        this.direction = originalDirection;
        pieces = new ArrayList<Piece>();
        pieces.add(new Piece(originalX, originalY));
        grow = false;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction dir) {
        direction = dir;
    }

    public int getLength() {
        return pieces.size();
    }

    public List<Piece> getPieces() {
        return pieces;
    }

    public void move() {
        if (grow) {
            grow = false;
        } else {
            if (pieces.size() >= 3)
                pieces.remove(0);
        }
        addPiece();
    }

    public void addPiece() {
        switch (direction) {
            case UP:    pieces.add(new Piece(x,y-1));
                        y = y-1;
                break;
            case RIGHT: pieces.add(new Piece(x+1,y));
                        x = x+1;
                break;
            case DOWN:  pieces.add(new Piece(x,y+1));
                        y = y+1;
                break;
            case LEFT:  pieces.add(new Piece(x-1,y));
                        x = x-1;
        }
    }

    public void grow() {
        grow = true;
    }

    public boolean runsInto(Piece piece) {
        for (Piece wormPiece:pieces) {
            if (wormPiece.runsInto(piece))
                return true;
        }
        return false;
    }

    public boolean runsIntoItself() {
        for (int i=0; i<pieces.size()-1; i++) {
            for (int j=i+1; j<pieces.size(); j++)
                if (pieces.get(i).runsInto(pieces.get(j)))
                    return true;
        }
        return false;
    }

    public boolean runsIntoBorder(int height, int width) {
        Piece wormHead = null;
        if (pieces.size() >= 1)
            wormHead = pieces.get(pieces.size()-1);
        else
            wormHead = pieces.get(0);

        if (wormHead.getX() == 0 && direction == Direction.LEFT)
            return true;
        if (wormHead.getX() == width && direction == Direction.RIGHT)
            return true;
        if (wormHead.getY() == 0 && direction == Direction.UP)
            return true;
        if (wormHead.getY() == height && direction == Direction.DOWN)
            return true;
        return false;
    }

    public void draw(Graphics graphics, int pieceLength) {
        for (Piece piece:pieces)
            piece.draw(graphics, pieceLength, 0);
    }
}