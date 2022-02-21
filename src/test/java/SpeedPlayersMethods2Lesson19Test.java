import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SpeedPlayersMethods2Lesson19Test {

    @Test
    public void numberOfDropoutsWhenLightIsRed() {
        SpeedPlayersMethods.IS_GREEN_LIGHT = false;
        SpeedPlayersMethods.MAX_SPEED = 2;

        int[] speedOfPlayer = {0, 3, 2};

        int expected = 1;
        int actual = SpeedPlayersMethods.numberOfDropouts(speedOfPlayer);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void numberOfDropoutsWhenLightIsGreen() {
        SpeedPlayersMethods.IS_GREEN_LIGHT = true;
        SpeedPlayersMethods.MAX_SPEED = 2;

        int[] speedOfPlayer = {0, 3, 2};

        int expected = 0;
        int actual = SpeedPlayersMethods.numberOfDropouts(speedOfPlayer);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void numberOfDropoutsWithGreenColorNegativeSpeed() {
        SpeedPlayersMethods.IS_GREEN_LIGHT = false;
        SpeedPlayersMethods.MAX_SPEED = 2;

        int[] speedOfPlayer = {0, -3, 2};

        int expected = 1;
        int actual = SpeedPlayersMethods.numberOfDropouts(speedOfPlayer);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void numberOfDropoutsWhenColorIsRedNegativeSpeed() {
        SpeedPlayersMethods.IS_GREEN_LIGHT = true;
        SpeedPlayersMethods.MAX_SPEED = 2;

        int[] speedOfPlayer = {0, -3, 2};

        int expected = 0;
        int actual = SpeedPlayersMethods.numberOfDropouts(speedOfPlayer);

        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void speedOfDropoutsAtRed() {
        SpeedPlayersMethods.IS_GREEN_LIGHT = false;
        SpeedPlayersMethods.MAX_SPEED = 2;

        int[] speedOfPlayer = {0, 3, 2};

        int[] expected = {3};
        int[] actual = SpeedPlayersMethods.speedsOfDropped(speedOfPlayer);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void speedOfDropoutsWhenGreen() {
        SpeedPlayersMethods.IS_GREEN_LIGHT = true;
        SpeedPlayersMethods.MAX_SPEED = 2;

        int[] speedOfPlayer = {0, 3, 2};

        int[] expected = {};
        int[] actual = SpeedPlayersMethods.speedsOfDropped(speedOfPlayer);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void speedOfDropoutsInRedIsNegativeSpeed() {
        int[] speedOfPlayer = {0, 3, -2,};
        SpeedPlayersMethods.IS_GREEN_LIGHT = false;
        SpeedPlayersMethods.MAX_SPEED = 2;

        int[] expected = {3};
        int[] actual = SpeedPlayersMethods.speedsOfDropped(speedOfPlayer);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void speedOfDropoutsInGreenIsNegativeSpeed() {
        SpeedPlayersMethods.IS_GREEN_LIGHT = true;
        SpeedPlayersMethods.MAX_SPEED = 2;

        int[] speedOfPlayer = {0, 3, -2};

        int[] expected = {};
        int[] actual = SpeedPlayersMethods.speedsOfDropped(speedOfPlayer);

        Assertions.assertArrayEquals(expected, actual);

    }


    @Test
    public void speedOfNonEliminatorsAtRed() {
        SpeedPlayersMethods.IS_GREEN_LIGHT = false;
        SpeedPlayersMethods.MAX_SPEED = 2;

        int[] speedOfPlayer = {0, 3, 2};

        int[] expected = {0, 2};
        int[] actual = SpeedPlayersMethods.speedsOfNotDropped(speedOfPlayer);

        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void speedOfNonEliminatorsWhenGreen() {
        SpeedPlayersMethods.IS_GREEN_LIGHT = true;
        SpeedPlayersMethods.MAX_SPEED = 2;

        int[] speedOfPlayer = {0, 3, 2};

        int[] expected = {0, 3, 2};
        int[] actual = SpeedPlayersMethods.speedsOfNotDropped(speedOfPlayer);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void speedOfNonEliminatorsWithRedColorAndNegativeSpeed() {
        SpeedPlayersMethods.IS_GREEN_LIGHT = false;
        SpeedPlayersMethods.MAX_SPEED = 2;

        int[] speedOfPlayer = {0, 3, -2};

        int[] expected = {0, -2};
        int[] actual = SpeedPlayersMethods.speedsOfNotDropped(speedOfPlayer);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void speedOfNonDropoutsWithGreenColorAndNegativeSpeed() {
        SpeedPlayersMethods.IS_GREEN_LIGHT = true;
        SpeedPlayersMethods.MAX_SPEED = 2;

        int[] speedOfPlayer = {0, 3, -2};

        int[] expected = {0, 3, -2};
        int[] actual = SpeedPlayersMethods.speedsOfNotDropped(speedOfPlayer);

        Assertions.assertArrayEquals(expected, actual);

    }

}
