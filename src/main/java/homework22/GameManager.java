package homework22;

import homework21.Game;

public class GameManager {

    private final Game game;

    public GameManager(Game game) {
        this.game = game;
    }

    public int calculateNumberOfRounds(int[] speedOfPlayer) {
        int round = 0;
        for (int i = 0; i != speedOfPlayer.length; ++i) {

            if (!game.isFailed(speedOfPlayer[i])) {
                ++round;
            }
        }
        return round;
    }
}
