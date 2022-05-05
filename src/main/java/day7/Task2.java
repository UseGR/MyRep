package day7;
import java.util.Random;
import static day7.Player.MAX_STAMINA;
public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        Player player1 = new Player(random.nextInt(MAX_STAMINA - 90 + 1) + 90); // У игрока, вышедшего на поле, от 90 до 100 ед. энергии
        Player.info();
        Player player2 = new Player(random.nextInt(MAX_STAMINA - 90 + 1) + 90);
        Player player3 = new Player(random.nextInt(MAX_STAMINA - 90 + 1) + 90);
        Player player4 = new Player(1);
        Player player5 = new Player(random.nextInt(MAX_STAMINA - 90 + 1) + 90);
        Player player6 = new Player(random.nextInt(MAX_STAMINA - 90 + 1) + 90);
        Player.info();
        Player player7 = new Player(random.nextInt(MAX_STAMINA - 90 + 1) + 90);
        player4.run();
        System.out.println(player4.getStamina());
        Player.info();
    }
}