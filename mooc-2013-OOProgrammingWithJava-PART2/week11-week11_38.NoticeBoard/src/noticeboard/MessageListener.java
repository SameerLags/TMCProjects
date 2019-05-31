package noticeboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class MessageListener implements ActionListener{
    private JTextField origin;
    private JLabel destination;
    
    public MessageListener(JTextField origin, JLabel destination) {
        this.destination = destination;
        this.origin = origin;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String text = origin.getText();
        origin.setText("");
        destination.setText(text);
    }
}