package Homework20;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestsForTheNonStaticGameMethods3Test {

    @Test
    public void numberOfDropoutsWhenLightIsRed() {
        NonStaticGameClassTask20 nonStaticGameClassTask20 = new NonStaticGameClassTask20(false, 3);

        int[] speedOfPlayer = {0, 3, 2};

        int expected = 0;
        int actual = NonStaticGameClassTask20.numberOfDropouts(speedOfPlayer);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void numberOfDropoutsWhenLightIsGreen() {
        NonStaticGameClassTask20 nonStaticGameClassTask20 = new NonStaticGameClassTask20(true, 3);

        int[] speedOfPlayer = {0, 3, 2};

        int expected = 0;
        int actual = NonStaticGameClassTask20.numberOfDropouts(speedOfPlayer);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void numberOfDropoutsWithGreenColorNegativeSpeed() {
        NonStaticGameClassTask20 nonStaticGameClassTask20 = new NonStaticGameClassTask20(false, 3);

        int[] speedOfPlayer = {0, -3, 2};

        int expected = 0;
        int actual = NonStaticGameClassTask20.numberOfDropouts(speedOfPlayer);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void numberOfDropoutsWhenColorIsRedNegativeSpeed() {
        NonStaticGameClassTask20 nonStaticGameClassTask20 = new NonStaticGameClassTask20(true, 3);

        int[] speedOfPlayer = {0, -3, 2};

        int expected = 0;
        int actual = NonStaticGameClassTask20.numberOfDropouts(speedOfPlayer);

        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void speedOfDropoutsAtRed() {
        NonStaticGameClassTask20 nonStaticGameClassTask20 = new NonStaticGameClassTask20(false, 3);

        int[] speedOfPlayer = {0, 3, 2};

        int[] expected = {};
        int[] actual = NonStaticGameClassTask20.speedsOfDropped(speedOfPlayer);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void speedOfDropoutsWhenGreen() {
        NonStaticGameClassTask20 nonStaticGameClassTask20 = new NonStaticGameClassTask20(true, 3);

        int[] speedOfPlayer = {0, 3, 2};

        int[] expected = {};
        int[] actual = NonStaticGameClassTask20.speedsOfDropped(speedOfPlayer);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void speedOfDropoutsInRedIsNegativeSpeed() {
        NonStaticGameClassTask20 nonStaticGameClassTask20 = new NonStaticGameClassTask20(false, 3);

        int[] speedOfPlayer = {0, 3, -2};

        int[] expected = {};
        int[] actual = NonStaticGameClassTask20.speedsOfDropped(speedOfPlayer);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void speedOfDropoutsInGreenIsNegativeSpeed() {
        NonStaticGameClassTask20 nonStaticGameClassTask20 = new NonStaticGameClassTask20(true, 3);

        int[] speedOfPlayer = {0, 3, -2};

        int[] expected = {};
        int[] actual = NonStaticGameClassTask20.speedsOfDropped(speedOfPlayer);

        Assertions.assertArrayEquals(expected, actual);

    }


    @Test
    public void speedOfNonEliminatorsAtRed() {
        NonStaticGameClassTask20 nonStaticGameClassTask20 = new NonStaticGameClassTask20(false, 3);

        int[] speedOfPlayer = {0, 3, 2};

        int[] expected = {0, 3, 2};
        int[] actual = NonStaticGameClassTask20.speedsOfNotDropped(speedOfPlayer);

        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void speedOfNonEliminatorsWhenGreen() {
        NonStaticGameClassTask20 nonStaticGameClassTask20 = new NonStaticGameClassTask20(true, 3);

        int[] speedOfPlayer = {0, 3, 2};

        int[] expected = {0, 3, 2};
        int[] actual = NonStaticGameClassTask20.speedsOfNotDropped(speedOfPlayer);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void speedOfNonEliminatorsWithRedColorAndNegativeSpeed() {
        NonStaticGameClassTask20 nonStaticGameClassTask20 = new NonStaticGameClassTask20(false, 3);

        int[] speedOfPlayer = {0, 3, -2};

        int[] expected = {0, 3, -2};
        int[] actual = NonStaticGameClassTask20.speedsOfNotDropped(speedOfPlayer);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void speedOfNonDropoutsWithGreenColorAndNegativeSpeed() {
        NonStaticGameClassTask20 nonStaticGameClassTask20 = new NonStaticGameClassTask20(true, 3);

        int[] speedOfPlayer = {0, 3, -2};

        int[] expected = {0, 3, -2};
        int[] actual = NonStaticGameClassTask20.speedsOfNotDropped(speedOfPlayer);

        Assertions.assertArrayEquals(expected, actual);

    }


}

