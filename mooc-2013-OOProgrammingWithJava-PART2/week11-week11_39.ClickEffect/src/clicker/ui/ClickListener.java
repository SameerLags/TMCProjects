package clicker.ui;

import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import clicker.applicationlogic.Calculator;

public class ClickListener implements ActionListener {
    private Calculator calculator;
    private JLabel jLabel;

    public ClickListener(Calculator calculator, JLabel jLabel) {
        this.calculator = calculator;
        this.jLabel = jLabel;
    }

    public void actionPerformed(ActionEvent ae) {
        calculator.increase();
        jLabel.setText(""+calculator.giveValue());
    }
}