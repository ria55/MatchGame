package application.gaming;

import application.helpers.GameHelper;
import application.models.Computer;
import application.models.StupidComputer;

import java.util.Scanner;

public class GameField {

    /**
     * This method is not the best way to solve the task, but never mind!
     */
    public void play() {
        Scanner scanner = new Scanner(System.in);

        Computer enemy = new StupidComputer();

        int matches = GameHelper.random(4, 40);

        do {
            System.out.println("Matches on the table: " + matches);
            System.out.println("Take 1-3 matches!");
            int playerMatches = scanner.nextInt();
            matches -= playerMatches;

            if (matches == 1) {
                System.out.println("You won!");
                break;
            }

            int enemyMatches = enemy.takeMatches(matches);
            matches -= enemyMatches;

            System.out.println("Computer took " + enemyMatches + " matches.");

            if (matches == 1) {
                System.out.println("Computer won!");
                break;
            }
        } while (true);
    }

}
