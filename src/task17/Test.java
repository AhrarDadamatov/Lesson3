package task17;

public class Test {
    public static void main(String[] args) {
        Player player1 = new Player(90);
        Player player2 = new Player(95);
        Player player3 = new Player(92);

        Player.info();

        Player player4 = new Player(100);
        Player player5 = new Player(100);
        Player player6 = new Player(98);

        Player.info();

        Player player7 = new Player(90);

        Player.info();

        for (int i = 0; i < 91; i++)
            player3.run();

        Player.info();
    }
}