
import java.awt.*;
import javax.swing.*;

public class GraphicCalculator implements Runnable {
    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("Calculator");
        frame.setPreferredSize(new Dimension(300, 200));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        createComponents(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        container.setLayout(new GridLayout(3,1));

        JTextField output = new JTextField("0");
        output.setEnabled(false);
        JTextField input = new JTextField("");

        container.add(output);
        container.add(input);
        container.add(createPanel(output, input));
    }

    private JPanel createPanel(JTextField output, JTextField input) {
        JPanel panel = new JPanel(new GridLayout(1,3));
        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton Z = new JButton("Z");

        PlusListener plusListener = new PlusListener(output, input, Z);
        plus.addActionListener(plusListener);
        MinusListener minusListener = new MinusListener(output, input, Z);
        minus.addActionListener(minusListener);
        ZListener zListener = new ZListener(output, input, Z);
        Z.addActionListener(zListener);
        Z.setEnabled(false);

        panel.add(plus);
        panel.add(minus);
        panel.add(Z);
        return panel;
    }

    public JFrame getFrame() {
        return frame;
    }
}
