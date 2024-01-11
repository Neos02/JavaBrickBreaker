public class Main {

    public static void main(String[] args) {
        Window window = new Window("Breakout");

        window.add(new Game(600, 800));
        window.pack();
        window.setVisibility(true);
    }
}