import java.awt.event.*;
import javax.swing.*;

public class MinusListener implements ActionListener {
    private JTextField output,input;
    private JButton jButton;

    public MinusListener(JTextField output, JTextField input, JButton button) {
        this.output = output;
        this.input = input;
        this.jButton = button;
    }

    public void actionPerformed(ActionEvent ae) {
        int outputVal = Integer.parseInt(output.getText());
        try {
            int inputVal = Integer.parseInt(input.getText());
            output.setText("" + (outputVal - inputVal));
        }
        catch (Exception e) {
        }
        input.setText("");
        if (output.getText().equals("0"))
            jButton.setEnabled(false);
    }
}