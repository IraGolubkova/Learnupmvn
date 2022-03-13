package homework23;


public class GameManager {

    private final Game game;

    public GameManager(Game game) {
        this.game = game;
    }

    public int calculateNumberOfRoundsPlayerWins(int[] speedOfPlayer) {
        int round = 0;
        for (int i = 0; i != speedOfPlayer.length; ++i) {

            if (!game.isFailed(speedOfPlayer[i])) {
                ++round;
            }
        }
        return round;
    }

    public static int loser(Movable p1, Movable p2, Game game, int rounds) {
        int[] speedOfPlayer1 = new int[rounds];
        int[] speedOfPlayer2 = new int[rounds];
        for (int i = 0; i != rounds; ++i) {
            speedOfPlayer1[i] = p1.getSpeed();
            speedOfPlayer2[i] = p2.getSpeed();
        }

        for (int i = 0; i != rounds; ++i){
            boolean player1IsFailed = game.isFailed(speedOfPlayer1[i]);
            boolean player2IsFailed = game.isFailed(speedOfPlayer2[i]);
            if (player1IsFailed && !player2IsFailed ){
                return -1;
            }
            else if (player2IsFailed && !player1IsFailed){
                return 1;
            }
            else if (player2IsFailed && player1IsFailed){
                return 0;
            }
        }
        return 0;
    }
}
