import javax.swing.JFrame;

public class Window extends JFrame {

    public Window(String title) {
        super(title);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
    }

    public void setVisibility(boolean visibility) {
        setLocationRelativeTo(null);
        setVisible(visibility);
    }
}
