package drawing.ui;

import javax.swing.SwingUtilities;
import drawing.ui.*;

public class Main {

    public static void main(String[] args) {
        UserInterface ui = new UserInterface();
        SwingUtilities.invokeLater(ui);
    }
}
