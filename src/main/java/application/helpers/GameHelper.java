package application.helpers;

public class GameHelper {

    public static final int MIN_MATCHES = 1;
    public static final int MAX_MATCHES = 3;

    public static int random(int min, int max) {
        return (int) (Math.random() * max + min);
    }

}
