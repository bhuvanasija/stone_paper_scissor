import javax.swing.*;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            RockPaperScissorsGUI gui = new RockPaperScissorsGUI();
            gui.setVisible(true);
        });
    }
}
