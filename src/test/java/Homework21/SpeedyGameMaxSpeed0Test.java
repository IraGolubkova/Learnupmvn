package Homework21;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SpeedyGameMaxSpeed0Test {


    @Test
    public void CheckingGetterAndSetterMethods() {
        SpeedyGame speedyGame = new SpeedyGame(true, 10);

        Assertions.assertTrue(speedyGame.isGreenLight());
        Assertions.assertEquals(10, speedyGame.getMaxSpeed());

        speedyGame.setGreenLight(false);
        speedyGame.setMaxSpeed(5);

        Assertions.assertFalse(speedyGame.isGreenLight());
        Assertions.assertEquals(5, speedyGame.getMaxSpeed());


    }

    @Test
    public void lostOrNotThePlayerIsRedLight() {
        SpeedyGame speedyGame = new SpeedyGame(false, 0);

        boolean actual = speedyGame.isFailed(5);

        Assertions.assertTrue(actual);

    }

    @Test
    public void lostOrNotThePlayerIsGreenLight() {
        SpeedyGame speedyGame = new SpeedyGame(true, 0);

        boolean actual = speedyGame.isFailed(5);

        Assertions.assertFalse(actual);

    }

    @Test
    public void lostOrNotThePlayerIsRedLightNegativeSpeed() {
        SpeedyGame speedyGame = new SpeedyGame(false, 0);

        boolean actual = speedyGame.isFailed(-5);

        Assertions.assertTrue(actual);

    }

    @Test
    public void lostOrNotThePlayerIsGreenLightNegativeSpeed() {
        SpeedyGame speedyGame = new SpeedyGame(true, 0);

        boolean actual = speedyGame.isFailed(-5);

        Assertions.assertFalse(actual);
    }
}


