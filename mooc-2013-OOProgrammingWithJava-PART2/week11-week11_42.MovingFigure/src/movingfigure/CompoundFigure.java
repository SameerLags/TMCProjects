package movingfigure;

import java.awt.Graphics;
import java.util.ArrayList;

public class CompoundFigure extends Figure {
    
    private ArrayList<Figure> listFigures;

    public CompoundFigure() {
        super(0,0);
        listFigures=new ArrayList<Figure>();
    }


    @Override
    public void draw(Graphics graphics) {
          for(Figure f:listFigures){
           f.draw(graphics);
       }
    }
    
    public void add(Figure f){
        listFigures.add(f);
    }

    @Override
    public void move(int dx, int dy) {
       for(Figure f:listFigures){
           f.move(dx, dy);
       }
    }
    
    
    
}