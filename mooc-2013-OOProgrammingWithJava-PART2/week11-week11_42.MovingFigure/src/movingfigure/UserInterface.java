package movingfigure;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;
    private Figure figure;

    public UserInterface(Figure figure) {
        this.figure = figure;
    }
    

    @Override
    public void run() {
        frame = new JFrame();
        frame.setPreferredSize(new Dimension(400, 400));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());
        addListeners();

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
       DrawingBoard drawingboard=new DrawingBoard(figure);
       container.add(drawingboard);
       
       KeyboardListener keyboardlistener=new KeyboardListener(container, figure);
       frame.addKeyListener(keyboardlistener);
    
    }

    private void addListeners() {
    }

    public JFrame getFrame() {
        return frame;
    }
}