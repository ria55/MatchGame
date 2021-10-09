package application.models;

import application.helpers.GameHelper;

public class StupidComputer implements Computer {

    @Override
    public int takeMatches(int matchesRemained) {
        return GameHelper.MIN_MATCHES;
    }

}
