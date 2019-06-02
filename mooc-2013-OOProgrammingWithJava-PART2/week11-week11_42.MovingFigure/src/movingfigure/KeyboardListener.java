package movingfigure;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardListener implements KeyListener {

    private Component component;
    private Figure figure;

    public KeyboardListener(Component component, Figure figure) {
        this.component = component;
        this.figure = figure;
    }

    @Override
    public void keyTyped(KeyEvent e) {
      
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
        int movement=e.getKeyCode();
        if (movement == KeyEvent.VK_LEFT) {
            figure.move(-1, 0);
        } else if (movement == KeyEvent.VK_RIGHT) {
            figure.move(1, 0);
        }
        
        else if(movement==KeyEvent.VK_DOWN)
            figure.move(0, 1);
         else if(movement==KeyEvent.VK_UP)
            figure.move(0, -1);
        
       component.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e
    ) {
       
    }

}