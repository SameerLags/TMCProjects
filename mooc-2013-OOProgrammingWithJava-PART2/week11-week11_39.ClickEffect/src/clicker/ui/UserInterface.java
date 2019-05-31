package clicker.ui;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.BorderLayout;
import javax.swing.*;
import clicker.applicationlogic.Calculator;

public class UserInterface implements Runnable {
    private JFrame frame;
    private Calculator calculator;

    public UserInterface() {}

    public UserInterface(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void run() {
        frame = new JFrame("Click Effect");
        frame.setPreferredSize(new Dimension(200, 100));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        JLabel valueLabel = new JLabel("" + calculator.giveValue());
        JButton clickButton = new JButton("Click!");

        ClickListener clickListener = new ClickListener(calculator, valueLabel);
        clickButton.addActionListener(clickListener);

        container.add(valueLabel, BorderLayout.WEST);
        container.add(clickButton, BorderLayout.SOUTH);
    }

    public JFrame getFrame() {
        return frame;
    }
}
