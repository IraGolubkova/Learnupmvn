package homework20;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestsForTheNonStaticGameMethods0Test {

    @Test
    public void numberOfDropoutsWhenLightIsRed() {
        NonStaticGameClassTask20 nonStaticGameClassTask20 = new NonStaticGameClassTask20(false, 0);

        int[] speedOfPlayer = {0, 3, 2};

        int expected = 2;
        int actual = nonStaticGameClassTask20.numberOfDropouts(speedOfPlayer);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void numberOfDropoutsWhenLightIsGreen() {
        NonStaticGameClassTask20 nonStaticGameClassTask20 = new NonStaticGameClassTask20(true, 0);

        int[] speedOfPlayer = {0, 3, 2};

        int expected = 0;
        int actual = nonStaticGameClassTask20.numberOfDropouts(speedOfPlayer);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void numberOfDropoutsWithGreenColorNegativeSpeed() {
        NonStaticGameClassTask20 nonStaticGameClassTask20 = new NonStaticGameClassTask20(false, 0);

        int[] speedOfPlayer = {0, -3, 2};

        int expected = 2;
        int actual = nonStaticGameClassTask20.numberOfDropouts(speedOfPlayer);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void numberOfDropoutsWhenColorIsRedNegativeSpeed() {
        NonStaticGameClassTask20 nonStaticGameClassTask20 = new NonStaticGameClassTask20(true, 0);

        int[] speedOfPlayer = {0, -3, 2};

        int expected = 0;
        int actual = nonStaticGameClassTask20.numberOfDropouts(speedOfPlayer);

        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void speedOfDropoutsAtRed() {
        NonStaticGameClassTask20 nonStaticGameClassTask20 = new NonStaticGameClassTask20(false, 0);

        int[] speedOfPlayer = {0, 3, 2};

        int[] expected = {3, 2};
        int[] actual = nonStaticGameClassTask20.speedsOfDropped(speedOfPlayer);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void speedOfDropoutsWhenGreen() {
        NonStaticGameClassTask20 nonStaticGameClassTask20 = new NonStaticGameClassTask20(true, 0);

        int[] speedOfPlayer = {0, 3, 2};

        int[] expected = {};
        int[] actual = nonStaticGameClassTask20.speedsOfDropped(speedOfPlayer);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void speedOfDropoutsInRedIsNegativeSpeed() {
        NonStaticGameClassTask20 nonStaticGameClassTask20 = new NonStaticGameClassTask20(false, 0);

        int[] speedOfPlayer = {0, 3, -2};

        int[] expected = {3, -2};
        int[] actual = nonStaticGameClassTask20.speedsOfDropped(speedOfPlayer);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void speedOfDropoutsInGreenIsNegativeSpeed() {
        NonStaticGameClassTask20 nonStaticGameClassTask20 = new NonStaticGameClassTask20(true, 0);

        int[] speedOfPlayer = {0, 3, -2};

        int[] expected = {};
        int[] actual = nonStaticGameClassTask20.speedsOfDropped(speedOfPlayer);

        Assertions.assertArrayEquals(expected, actual);

    }


    @Test
    public void speedOfNonEliminatorsAtRed() {
        NonStaticGameClassTask20 nonStaticGameClassTask20 = new NonStaticGameClassTask20(false, 0);

        int[] speedOfPlayer = {0, 3, 2};

        int[] expected = {0};
        int[] actual = nonStaticGameClassTask20.speedsOfNotDropped(speedOfPlayer);

        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void speedOfNonEliminatorsWhenGreen() {
        NonStaticGameClassTask20 nonStaticGameClassTask20 = new NonStaticGameClassTask20(true, 0);

        int[] speedOfPlayer = {0, 3, 2};

        int[] expected = {0, 3, 2};
        int[] actual = nonStaticGameClassTask20.speedsOfNotDropped(speedOfPlayer);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void speedOfNonEliminatorsWithRedColorAndNegativeSpeed() {
        NonStaticGameClassTask20 nonStaticGameClassTask20 = new NonStaticGameClassTask20(false, 0);

        int[] speedOfPlayer = {0, 3, -2};

        int[] expected = {0};
        int[] actual = nonStaticGameClassTask20.speedsOfNotDropped(speedOfPlayer);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void speedOfNonDropoutsWithGreenColorAndNegativeSpeed() {
        NonStaticGameClassTask20 nonStaticGameClassTask20 = new NonStaticGameClassTask20(true, 0);

        int[] speedOfPlayer = {0, 3, -2};

        int[] expected = {0, 3, -2};
        int[] actual = nonStaticGameClassTask20.speedsOfNotDropped(speedOfPlayer);

        Assertions.assertArrayEquals(expected, actual);

    }


}

