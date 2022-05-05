package day7;
public class Player {
    private int stamina;
    public final static int MAX_STAMINA = 100;
    public final static int MIN_STAMINA = 0;
    public final static int AMOUNT_PLAYERS = 6;
    private static int countPlayers = 0;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < AMOUNT_PLAYERS)
            countPlayers++;
    }
    public int getStamina() {
        return stamina;
    }
    public void run() {
        if (stamina > MIN_STAMINA) {
            System.out.println("Игрок бежит...");
            stamina--;
            if (stamina == MIN_STAMINA) {
                System.out.println("Игроку нужен отдых, он уходит с поля");
                countPlayers--;
            }
        }
    }
    public static void info() {
        if (countPlayers < AMOUNT_PLAYERS)
            System.out.println("Команды неполные, на поле еще есть " + (AMOUNT_PLAYERS - countPlayers) + " свободных мест");
        else
            System.out.println("На поле нет свободных мест");
    }
}