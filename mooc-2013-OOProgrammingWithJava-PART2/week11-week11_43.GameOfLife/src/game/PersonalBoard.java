package game;

import gameoflife.GameOfLifeBoard;
import static java.lang.Math.random;
import static java.lang.StrictMath.random;
import java.util.Random;

public class PersonalBoard extends GameOfLifeBoard {
    private Random random;
    public PersonalBoard(int width, int height) {
        super(width, height);
        random=new Random();
     
        
    }

   @Override
    public void initiateRandomCells(double probabilityForEachCell) {
        for (int i = 0; i < super.getBoard().length; i++) {
            for (int j = 0; j < super.getBoard()[i].length; j++) {
                double individualQuotient = random.nextDouble();
                if (individualQuotient <= probabilityForEachCell && probabilityForEachCell != 0) {
                    super.getBoard()[i][j] = true;
                } else {
                    super.getBoard()[i][j] = false;
                }
            }
        }
    }

    @Override
    public boolean isAlive(int i, int i1) {
        if (!isOnBoard(i, i1)) {
            return false;
        }
      
     
        return super.getBoard()[i][i1];

    }

    @Override
    public void turnToLiving(int i, int i1) {

        if (!isOnBoard(i, i1)) {
            return;
        }
        super.getBoard()[i][i1] = true;
    }

    @Override
    public void turnToDead(int i, int i1) {
        if (!isOnBoard(i, i1)) {
            return;
        }
        super.getBoard()[i][i1] = false;
    }

    @Override
    public int getNumberOfLivingNeighbours(int i, int i1) {
        int count = 0;
        boolean[][] board = super.getBoard();

        for (int k = -1; k < 2; ++k) {
            for (int j = -1; j < 2; ++j) {
                if (k == 0 && j == 0) {
                    continue;
                }
                if (!isOnBoard(i + k, i1 + j)) {
                    continue;
                }
                if (board[i + k][i1 + j]) {
                    count++;
                }
            }
        }

        return count;
    }

    @Override
    public void manageCell(int i, int i1, int i2) {
        int nbors = getNumberOfLivingNeighbours(i, i1);

        if (!isAlive(i, i1) && nbors == 3) {
            turnToLiving(i, i1);
            return;
        } else {

            if (nbors < 2) {
                turnToDead(i, i1);
            } else if (nbors <= 3) {
                return;
            } else if (nbors > 3) {
                turnToDead(i, i1);
            }

        }
    }
    
    

    private boolean isOnBoard(int i, int i1) {

        if ((i < 0 || i > super.getWidth() - 1) || (i1 < 0 || i1 > super.getHeight() - 1)) {
            return false;
        }
        return true;
    }

}