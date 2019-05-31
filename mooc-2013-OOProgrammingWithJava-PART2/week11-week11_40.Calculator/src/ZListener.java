import java.awt.event.*;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ZListener implements ActionListener {
    private JTextField output, input;
    private JButton button;

    public ZListener(JTextField output, JTextField input, JButton button) {
        this.output = output;
        this.input = input;
        this.button = button;
    }

    public void actionPerformed(ActionEvent ae) {
        output.setText("0");
        input.setText("");
        button.setEnabled(false);
    }
}