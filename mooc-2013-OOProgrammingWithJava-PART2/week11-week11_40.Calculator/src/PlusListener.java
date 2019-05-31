import java.awt.event.*;
import javax.swing.*;

public class PlusListener implements ActionListener {
    private JTextField output,input;
    private JButton jButton;

    public PlusListener(JTextField output, JTextField input, JButton button) {
        this.output = output;
        this.input = input;
        this.jButton = button;
    }

    public void actionPerformed(ActionEvent ae) {
        int outputVal = Integer.parseInt(output.getText());
        try {
            int inputVal = Integer.parseInt(input.getText());
            output.setText("" + (outputVal + inputVal));
        }
        catch (Exception e) {
        }
        input.setText("");
        jButton.setEnabled(true);
    }
}