import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

public class Game extends JPanel implements Runnable {

    private final Thread thread;
    private boolean running;

    public Game(int width, int height) {
        super(true);

        setPreferredSize(new Dimension(width, height));

        this.thread = new Thread(this);
        this.running = false;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Background
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight());
    }

    public synchronized void start() {
        if(running) {
            return;
        }

        thread.start();
        this.running = true;
    }

    public synchronized void stop() {
        if(!this.running) {
            return;
        }

        try {
            thread.join();
        } catch(InterruptedException e) {
            System.out.println(e.getMessage());
        }

        this.running = false;
        System.exit(0);
    }

    @Override
    public void run() {
        System.out.println("Starting Game...");
    }
}
