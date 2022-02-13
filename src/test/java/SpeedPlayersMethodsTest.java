import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SpeedPlayersMethodsTest {

    @Test
    public void numberOfDropoutsWhenLightIsRed() {
        SpeedPlayersMethods.isGreenLight = false;

        int[] speedOfPlayer = {0, 3, 2,};
        int expected = 2;

        int actual = SpeedPlayersMethods.numberOfDropouts(speedOfPlayer);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void numberOfDropoutsWhenLightIsGreen() {
        SpeedPlayersMethods.isGreenLight = true;

        int[] speedOfPlayer = {0, 3, 2,};
        int expected = 0;

        int actual = SpeedPlayersMethods.numberOfDropouts(speedOfPlayer);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void numberOfDropoutsWithGreenColorNegativeSpeed() {
        SpeedPlayersMethods.isGreenLight = false;

        int[] speedOfPlayer = {0, -3, 2,};
        int expected = 2;

        int actual = SpeedPlayersMethods.numberOfDropouts(speedOfPlayer);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void numberOfDropoutsWhenColorIsRedNegativeSpeed() {
        SpeedPlayersMethods.isGreenLight = true;

        int[] speedOfPlayer = {0, -3, 2,};

        int expected = 0;
        int actual = SpeedPlayersMethods.numberOfDropouts(speedOfPlayer);

        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void SpeedOfDropoutsAtRed() {
        int[] speedOfPlayer = {0, 3, 2,};
        SpeedPlayersMethods.isGreenLight = false;

        int[] expected = {3, 2};
        int[] actual = SpeedPlayersMethods.speedsOfDropped(speedOfPlayer);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void SpeedOfDropoutsWhenGreen() {
        int[] speedOfPlayer = {0, 3, 2,};
        SpeedPlayersMethods.isGreenLight = true;

        int[] expected = {};
        int[] actual = SpeedPlayersMethods.speedsOfDropped(speedOfPlayer);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void SpeedOfDropoutsInRedIsNegativeSpeed() {
        int[] speedOfPlayer = {0, 3, -2,};
        SpeedPlayersMethods.isGreenLight = false;

        int[] expected = {3, -2};
        int[] actual = SpeedPlayersMethods.speedsOfDropped(speedOfPlayer);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void SpeedOfDropoutsInGreenIsNegativeSpeed() {
        int[] speedOfPlayer = {0, 3, -2,};
        SpeedPlayersMethods.isGreenLight = true;

        int[] expected = {};
        int[] actual = SpeedPlayersMethods.speedsOfDropped(speedOfPlayer);

        Assertions.assertArrayEquals(expected, actual);

    }


    @Test
    public void SpeedOfNonEliminatorsAtRed() {
        int[] speedOfPlayer = {0, 3, 2,};
        SpeedPlayersMethods.isGreenLight = false;

        int[] expected = {0};
        int[] actual = SpeedPlayersMethods.speedsOfNotDropped(speedOfPlayer);

        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void SpeedOfNonEliminatorsWhenGreen() {
        int[] speedOfPlayer = {0, 3, 2,};
        SpeedPlayersMethods.isGreenLight = true;

        int[] expected = {0, 3, 2};
        int[] actual = SpeedPlayersMethods.speedsOfNotDropped(speedOfPlayer);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void SpeedOfNonEliminatorsWithRedColorAndNegativeSpeed() {
        int[] speedOfPlayer = {0, 3, -2,};
        SpeedPlayersMethods.isGreenLight = false;

        int[] expected = {0};
        int[] actual = SpeedPlayersMethods.speedsOfNotDropped(speedOfPlayer);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void SpeedOfNonDropoutsWithGreenColorAndNegativeSpeed() {
        int[] speedOfPlayer = {0, 3, -2,};
        SpeedPlayersMethods.isGreenLight = true;

        int[] expected = {0, 3, -2};
        int[] actual = SpeedPlayersMethods.speedsOfNotDropped(speedOfPlayer);

        Assertions.assertArrayEquals(expected, actual);

    }
}

