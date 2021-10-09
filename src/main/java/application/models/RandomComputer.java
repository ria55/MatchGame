package application.models;

import application.helpers.GameHelper;

public class RandomComputer implements Computer {

    @Override
    public int takeMatches(int matchesRemained) {
        int take = GameHelper.random(GameHelper.MIN_MATCHES,
                GameHelper.MAX_MATCHES);
        return Math.min(matchesRemained, take);
    }

}
