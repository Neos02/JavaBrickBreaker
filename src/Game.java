import javax.swing.*;

public class Game extends JFrame {

    public Game(int width, int height, String title) {
        super(title);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(width, height);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

}
