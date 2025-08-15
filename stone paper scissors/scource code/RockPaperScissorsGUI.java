import javax.swing.*;
import java.awt.Font;

public class RockPaperScissorsGUI extends JFrame {
    public RockPaperScissorsGUI() {
        super("Rock Paper Scissors");
        setSize(450, 574);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        addGuiComponents();
    }

    private void addGuiComponents() {
        JLabel computerScoreLabel = new JLabel("Computer : 0");
        computerScoreLabel.setBounds(0, 43, 450, 30);
        computerScoreLabel.setFont(new Font("Dialog", Font.BOLD, 26));
        computerScoreLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(computerScoreLabel);
    }
}
