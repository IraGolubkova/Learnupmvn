import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SpeedPlayersMethods0Test {

    @Test
    public void numberOfDropoutsWhenLightIsRed() {
        SpeedPlayersMethods.IS_GREEN_LIGHT = false;
        SpeedPlayersMethods.MAX_SPEED = 0;

        int[] speedOfPlayer = {0, 3, 2,};
        int expected = 2;

        int actual = SpeedPlayersMethods.numberOfDropouts(speedOfPlayer);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void numberOfDropoutsWhenLightIsGreen() {
        SpeedPlayersMethods.IS_GREEN_LIGHT = true;
        SpeedPlayersMethods.MAX_SPEED = 0;

        int[] speedOfPlayer = {0, 3, 2,};
        int expected = 0;

        int actual = SpeedPlayersMethods.numberOfDropouts(speedOfPlayer);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void numberOfDropoutsWithGreenColorNegativeSpeed() {
        SpeedPlayersMethods.IS_GREEN_LIGHT = false;
        SpeedPlayersMethods.MAX_SPEED = 0;

        int[] speedOfPlayer = {0, -3, 2,};
        int expected = 2;

        int actual = SpeedPlayersMethods.numberOfDropouts(speedOfPlayer);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void numberOfDropoutsWhenColorIsRedNegativeSpeed() {
        SpeedPlayersMethods.IS_GREEN_LIGHT = true;
        SpeedPlayersMethods.MAX_SPEED = 0;

        int[] speedOfPlayer = {0, -3, 2,};

        int expected = 0;
        int actual = SpeedPlayersMethods.numberOfDropouts(speedOfPlayer);

        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void speedOfDropoutsAtRed() {
        int[] speedOfPlayer = {0, 3, 2,};
        SpeedPlayersMethods.IS_GREEN_LIGHT = false;
        SpeedPlayersMethods.MAX_SPEED = 0;

        int[] expected = {3, 2};
        int[] actual = SpeedPlayersMethods.speedsOfDropped(speedOfPlayer);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void speedOfDropoutsWhenGreen() {
        int[] speedOfPlayer = {0, 3, 2,};
        SpeedPlayersMethods.IS_GREEN_LIGHT = true;
        SpeedPlayersMethods.MAX_SPEED = 0;

        int[] expected = {};
        int[] actual = SpeedPlayersMethods.speedsOfDropped(speedOfPlayer);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void speedOfDropoutsInRedIsNegativeSpeed() {
        int[] speedOfPlayer = {0, 3, -2,};
        SpeedPlayersMethods.IS_GREEN_LIGHT = false;
        SpeedPlayersMethods.MAX_SPEED = 0;

        int[] expected = {3, -2};
        int[] actual = SpeedPlayersMethods.speedsOfDropped(speedOfPlayer);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void speedOfDropoutsInGreenIsNegativeSpeed() {
        int[] speedOfPlayer = {0, 3, -2,};
        SpeedPlayersMethods.IS_GREEN_LIGHT = true;
        SpeedPlayersMethods.MAX_SPEED = 0;

        int[] expected = {};
        int[] actual = SpeedPlayersMethods.speedsOfDropped(speedOfPlayer);

        Assertions.assertArrayEquals(expected, actual);

    }


    @Test
    public void speedOfNonEliminatorsAtRed() {
        int[] speedOfPlayer = {0, 3, 2,};
        SpeedPlayersMethods.IS_GREEN_LIGHT = false;
        SpeedPlayersMethods.MAX_SPEED = 0;

        int[] expected = {0};
        int[] actual = SpeedPlayersMethods.speedsOfNotDropped(speedOfPlayer);

        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void speedOfNonEliminatorsWhenGreen() {
        int[] speedOfPlayer = {0, 3, 2,};
        SpeedPlayersMethods.IS_GREEN_LIGHT = true;
        SpeedPlayersMethods.MAX_SPEED = 0;

        int[] expected = {0, 3, 2};
        int[] actual = SpeedPlayersMethods.speedsOfNotDropped(speedOfPlayer);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void speedOfNonEliminatorsWithRedColorAndNegativeSpeed() {
        int[] speedOfPlayer = {0, 3, -2,};
        SpeedPlayersMethods.IS_GREEN_LIGHT = false;
        SpeedPlayersMethods.MAX_SPEED = 0;

        int[] expected = {0};
        int[] actual = SpeedPlayersMethods.speedsOfNotDropped(speedOfPlayer);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void speedOfNonDropoutsWithGreenColorAndNegativeSpeed() {
        int[] speedOfPlayer = {0, 3, -2,};
        SpeedPlayersMethods.IS_GREEN_LIGHT = true;
        SpeedPlayersMethods.MAX_SPEED = 0;

        int[] expected = {0, 3, -2};
        int[] actual = SpeedPlayersMethods.speedsOfNotDropped(speedOfPlayer);

        Assertions.assertArrayEquals(expected, actual);

    }


}


