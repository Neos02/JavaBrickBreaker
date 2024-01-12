public class Main {

    public static void main(String[] args) {
        Window window = new Window("Breakout");
        Game game = new Game(600, 800);

        window.add(game);
        window.pack();
        window.setVisibility(true);
        game.start();
    }
}