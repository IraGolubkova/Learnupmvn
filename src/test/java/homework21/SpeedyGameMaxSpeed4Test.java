package homework21;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SpeedyGameMaxSpeed4Test {

    @Test
    public void lostOrNotThePlayerIsRedLight() {
        SpeedyGame speedyGame = new SpeedyGame(false, 4);

        boolean actual = speedyGame.isFailed(5);

        Assertions.assertTrue(actual);

    }

    @Test
    public void lostOrNotThePlayerIsGreenLight() {
        SpeedyGame speedyGame = new SpeedyGame(true, 4);

        boolean actual = speedyGame.isFailed(5);

        Assertions.assertFalse(actual);

    }

    @Test
    public void lostOrNotThePlayerIsRedLightNegativeSpeed() {
        SpeedyGame speedyGame = new SpeedyGame(false, 4);

        boolean actual = speedyGame.isFailed(-5);

        Assertions.assertTrue(actual);

    }

    @Test
    public void lostOrNotThePlayerIsGreenLightNegativeSpeed() {
        SpeedyGame speedyGame = new SpeedyGame(true, 4);

        boolean actual = speedyGame.isFailed(-5);

        Assertions.assertFalse(actual);

    }
}