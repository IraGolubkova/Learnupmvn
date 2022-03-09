package homework22;

import homework21.Game;

public class GameManager {

    private final Game game;

    public GameManager(Game game) {
        this.game = game;
    }

    public int calculateNumberOfRounds(int[] speedPlayer) {
        int round = 0;
        for (int i = 0; i != speedPlayer.length; ++i) {

            if (!game.isFailed(speedPlayer[i])) {
                ++round;
            }
        }
        return round;
    }
}
