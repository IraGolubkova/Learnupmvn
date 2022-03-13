package homework23;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GameManagerTest {

    @Test
    public void theSecondPlayerWillLoseIsRed() {

        Game game = new SpeedyGame(false, 5);
        GameManager gameManager = new GameManager(game);

        Movable p1 = new ConstantPlayer(5);
        Movable p2 = new FastPlayer(4, 1);
        int rounds = 3;

        int actual = GameManager.loser(p1, p2, game, rounds);
        int expected = 1;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void allPlayersWinIsRed() {

        Game game = new SpeedyGame(false, 0);
        GameManager gameManager = new GameManager(game);

        Movable p1 = new ConstantPlayer(5);
        Movable p2 = new FastPlayer(4, 1);
        int rounds = 3;

        int actual = GameManager.loser(p1, p2, game, rounds);
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void theFirstPlayerToLoseIsRed() {

        Game game = new SpeedyGame(false, 4);
        //GameManager gameManager = new GameManager(game);

        Movable p1 = new ConstantPlayer(5);
        Movable p2 = new FastPlayer(4, 1);
        int rounds = 3;

        int actual = GameManager.loser(p1, p2, game, rounds);
        int expected = -1;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void theSecondPlayerWillLoseIsGreen() {

        Game game = new SpeedyGame(true, 5);
        GameManager gameManager = new GameManager(game);

        Movable p1 = new ConstantPlayer(5);
        Movable p2 = new FastPlayer(4, 1);
        int rounds = 3;

        int actual = GameManager.loser(p1, p2, game, rounds);
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void allPlayersWinIsGreen() {

        Game game = new SpeedyGame(true, 0);
        GameManager gameManager = new GameManager(game);

        Movable p1 = new ConstantPlayer(5);
        Movable p2 = new FastPlayer(4, 1);
        int rounds = 3;

        int actual = GameManager.loser(p1, p2, game, rounds);
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void theFirstPlayerToLoseIsGreen() {

        Game game = new SpeedyGame(true, 4);
        GameManager gameManager = new GameManager(game);

        Movable p1 = new ConstantPlayer(5);
        Movable p2 = new FastPlayer(4, 1);
        int rounds = 3;

        int actual = gameManager.loser(p1, p2, game, rounds);
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void negativeSpeedStepIsAllGoneWhenRed() {

        Game game = new SpeedyGame(false, 4);
        GameManager gameManager = new GameManager(game);

        Movable p1 = new ConstantPlayer(6);
        Movable p2 = new FastPlayer(6, -1);
        int rounds = 3;

        int actual = gameManager.loser(p1, p2, game, rounds);
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void negativeSpeedStepIsAllGoneWhenGreen() {

        Game game = new SpeedyGame(false, 4);
        GameManager gameManager = new GameManager(game);

        Movable p1 = new ConstantPlayer(6);
        Movable p2 = new FastPlayer(6, -1);
        int rounds = 3;

        int actual = gameManager.loser(p1, p2, game, rounds);
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

}