import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SpeedPlayersMethods3Lesson19Test {

    @Test
    public void numberOfDropoutsWhenLightIsRed() {
        ArrayOfNamesOfSurvivingPlayers.IS_GREEN_LIGHT = false;
        ArrayOfNamesOfSurvivingPlayers.MAX_SPEED = 3;

        int[] speedOfPlayer = {0, 3, 2};

        int expected = 0;
        int actual = ArrayOfNamesOfSurvivingPlayers.numberOfDropouts(speedOfPlayer);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void numberOfDropoutsWhenLightIsGreen() {
        ArrayOfNamesOfSurvivingPlayers.IS_GREEN_LIGHT = true;
        ArrayOfNamesOfSurvivingPlayers.MAX_SPEED = 3;

        int[] speedOfPlayer = {0, 3, 2};

        int expected = 0;
        int actual = ArrayOfNamesOfSurvivingPlayers.numberOfDropouts(speedOfPlayer);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void numberOfDropoutsWithGreenColorNegativeSpeed() {
        ArrayOfNamesOfSurvivingPlayers.IS_GREEN_LIGHT = false;
        ArrayOfNamesOfSurvivingPlayers.MAX_SPEED = 3;

        int[] speedOfPlayer = {0, -3, 2};

        int expected = 0;
        int actual = ArrayOfNamesOfSurvivingPlayers.numberOfDropouts(speedOfPlayer);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void numberOfDropoutsWhenColorIsRedNegativeSpeed() {
        ArrayOfNamesOfSurvivingPlayers.IS_GREEN_LIGHT = true;
        ArrayOfNamesOfSurvivingPlayers.MAX_SPEED = 3;

        int[] speedOfPlayer = {0, -3, 2};

        int expected = 0;
        int actual = ArrayOfNamesOfSurvivingPlayers.numberOfDropouts(speedOfPlayer);

        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void speedOfDropoutsAtRed() {
        ArrayOfNamesOfSurvivingPlayers.IS_GREEN_LIGHT = false;
        ArrayOfNamesOfSurvivingPlayers.MAX_SPEED = 3;

        int[] speedOfPlayer = {0, 3, 2};

        int[] expected = {};
        int[] actual = ArrayOfNamesOfSurvivingPlayers.speedsOfDropped(speedOfPlayer);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void speedOfDropoutsWhenGreen() {
        ArrayOfNamesOfSurvivingPlayers.IS_GREEN_LIGHT = true;
        ArrayOfNamesOfSurvivingPlayers.MAX_SPEED = 3;

        int[] speedOfPlayer = {0, 3, 2};

        int[] expected = {};
        int[] actual = ArrayOfNamesOfSurvivingPlayers.speedsOfDropped(speedOfPlayer);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void speedOfDropoutsInRedIsNegativeSpeed() {
        ArrayOfNamesOfSurvivingPlayers.IS_GREEN_LIGHT = false;
        ArrayOfNamesOfSurvivingPlayers.MAX_SPEED = 3;

        int[] speedOfPlayer = {0, 3, -2};

        int[] expected = {};
        int[] actual = ArrayOfNamesOfSurvivingPlayers.speedsOfDropped(speedOfPlayer);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void speedOfDropoutsInGreenIsNegativeSpeed() {
        ArrayOfNamesOfSurvivingPlayers.IS_GREEN_LIGHT = true;
        ArrayOfNamesOfSurvivingPlayers.MAX_SPEED = 3;

        int[] speedOfPlayer = {0, 3, -2};

        int[] expected = {};
        int[] actual = ArrayOfNamesOfSurvivingPlayers.speedsOfDropped(speedOfPlayer);

        Assertions.assertArrayEquals(expected, actual);

    }


    @Test
    public void speedOfNonEliminatorsAtRed() {
        ArrayOfNamesOfSurvivingPlayers.IS_GREEN_LIGHT = false;
        ArrayOfNamesOfSurvivingPlayers.MAX_SPEED = 3;

        int[] speedOfPlayer = {0, 3, 2};

        int[] expected = {0, 3, 2};
        int[] actual = ArrayOfNamesOfSurvivingPlayers.speedsOfNotDropped(speedOfPlayer);

        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void speedOfNonEliminatorsWhenGreen() {
        ArrayOfNamesOfSurvivingPlayers.IS_GREEN_LIGHT = true;
        ArrayOfNamesOfSurvivingPlayers.MAX_SPEED = 3;

        int[] speedOfPlayer = {0, 3, 2};

        int[] expected = {0, 3, 2};
        int[] actual = ArrayOfNamesOfSurvivingPlayers.speedsOfNotDropped(speedOfPlayer);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void speedOfNonEliminatorsWithRedColorAndNegativeSpeed() {
        ArrayOfNamesOfSurvivingPlayers.IS_GREEN_LIGHT = false;
        ArrayOfNamesOfSurvivingPlayers.MAX_SPEED = 3;

        int[] speedOfPlayer = {0, 3, -2};

        int[] expected = {0, 3, -2};
        int[] actual = ArrayOfNamesOfSurvivingPlayers.speedsOfNotDropped(speedOfPlayer);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void speedOfNonDropoutsWithGreenColorAndNegativeSpeed() {
        ArrayOfNamesOfSurvivingPlayers.IS_GREEN_LIGHT = true;
        ArrayOfNamesOfSurvivingPlayers.MAX_SPEED = 3;

        int[] speedOfPlayer = {0, 3, -2};

        int[] expected = {0, 3, -2};
        int[] actual = ArrayOfNamesOfSurvivingPlayers.speedsOfNotDropped(speedOfPlayer);

        Assertions.assertArrayEquals(expected, actual);

    }


}
