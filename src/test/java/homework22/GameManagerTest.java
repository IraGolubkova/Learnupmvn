package homework22;

import homework21.Game;
import homework21.SpeedyGame;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameManagerTest {

    @Test
    public void shouldCalculateNumberOfRoundsForGameWithoutMaxSpeedWhenLightIsRed() {
        Game game = new Game(false);

        GameManager gameManager = new GameManager(game);

        int[] speedsOfPlayer = {0, 1, 2, 3, 0};

        int actual = gameManager.calculateNumberOfRounds(speedsOfPlayer);
        int expected = 2;


        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateNumberOfRoundsForGameWithoutMaxSpeedWhenLightIsGreen() {
        Game game = new Game(true);

        GameManager gameManager = new GameManager(game);

        int[] speedsOfPlayer = {0, 1, 2, 3, 0};

        int actual = gameManager.calculateNumberOfRounds(speedsOfPlayer);
        int expected = 5;


        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateNumberOfRoundsForGameWithMaxSpeedWhenLightIsRed() {
        Game game = new SpeedyGame(false, 2);

        GameManager gameManager = new GameManager(game);

        int[] speedsOfPlayer = {0, 1, 2, 3, 0};

        int actual = gameManager.calculateNumberOfRounds(speedsOfPlayer);
        int expected = 4;


        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateNumberOfRoundsForGameWithMaxSpeedWhenLightIsGreen() {
        Game game = new SpeedyGame(true, 2);

        GameManager gameManager = new GameManager(game);

        int[] speedsOfPlayer = {0, 1, 2, 3, 0};

        int actual = gameManager.calculateNumberOfRounds(speedsOfPlayer);
        int expected = 5;


        Assertions.assertEquals(expected, actual);
    }

}






