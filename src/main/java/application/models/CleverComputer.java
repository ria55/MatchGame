package application.models;

import application.helpers.GameHelper;

public class CleverComputer implements Computer {

    @Override
    public int takeMatches(int matchesRemained) {
        switch (matchesRemained) {
            case 4:
                return 3;
            case 3:
                return 2;
            case 2:
                return 1;
            default:
                return GameHelper.random(GameHelper.MIN_MATCHES,
                        GameHelper.MAX_MATCHES);
        }
    }

}
