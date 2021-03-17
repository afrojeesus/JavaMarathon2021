package day7;

public class Player {
    private int stamina;
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private static int countPlayers = 0;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6) {
            countPlayers++;
        }

    }

    public void run() {
        if (stamina == 0) {
            return;
        }
        stamina--;
        if (stamina==0) {
            countPlayers--;
        }
    }

    public static void info() {
        if (countPlayers < 6) {
            System.out.println("Команды не полные. на поле есть еще " + (6 - countPlayers) + " свободных сест.");
        } else {
            System.out.println("На поле нет свободных мест.");
        }
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public static void setCountPlayers(int countPlayers) {
        Player.countPlayers = countPlayers;
    }
}