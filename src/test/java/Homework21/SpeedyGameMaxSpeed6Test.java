package Homework21;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SpeedyGameMaxSpeed6Test {

    @Test
    public void lostOrNotThePlayerIsRedLight() {
        SpeedyGame speedyGame = new SpeedyGame(false, 6);

        boolean actual = speedyGame.isFailed(5);

        Assertions.assertFalse(actual);


    }

    @Test
    public void lostOrNotThePlayerIsGreenLight() {
        SpeedyGame speedyGame = new SpeedyGame(true, 6);

        boolean actual = speedyGame.isFailed(5);

        Assertions.assertFalse(actual);

    }

    @Test
    public void lostOrNotThePlayerIsRedLightNegativeSpeed() {
        SpeedyGame speedyGame = new SpeedyGame(false, 6);

        boolean actual = speedyGame.isFailed(-5);

        Assertions.assertFalse(actual);

    }

    @Test
    public void lostOrNotThePlayerIsGreenLightNegativeSpeed() {
        SpeedyGame speedyGame = new SpeedyGame(true, 6);

        boolean actual = speedyGame.isFailed(-5);

        Assertions.assertFalse(actual);

    }
}
