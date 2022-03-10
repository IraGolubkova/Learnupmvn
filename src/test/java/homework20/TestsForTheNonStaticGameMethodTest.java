package homework20;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestsForTheNonStaticGameMethodTest {

    @Test
    public void ArrayOfNamesOfSurvivingPlayersIsRed() {
        NonStaticGameClassTask20 nonStaticGameClassTask20 = new NonStaticGameClassTask20(false, 0);

        String[] names = {"Elena 0", "Victor 3", "Maria 2",};
        String[] expected = {"Elena"};
        String[] actual = nonStaticGameClassTask20.namesOfSurvivorsNonStatic(names);

        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void ArrayOfNamesOfSurvivingPlayersIsGreen() {
        NonStaticGameClassTask20 nonStaticGameClassTask20 = new NonStaticGameClassTask20(true, 0);

        String[] names = {"Elena 0", "Victor 3", "Maria 2",};
        String[] expected = {};
        String[] actual = nonStaticGameClassTask20.namesOfSurvivorsNonStatic(names);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ArrayOfNamesOfSurvivingPlayersInRedNegativeSpeed() {
        NonStaticGameClassTask20 nonStaticGameClassTask20 = new NonStaticGameClassTask20(false, 0);

        String[] names = {"Elena 0", "Victor -3", "Maria 2",};
        String[] expected = {"Elena"};
        String[] actual = nonStaticGameClassTask20.namesOfSurvivorsNonStatic(names);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void ArrayOfNamesOfSurvivingPlayersInGreenNegativeSpeed() {
        NonStaticGameClassTask20 nonStaticGameClassTask20 = new NonStaticGameClassTask20(true, 0);

        String[] names = {"Elena 0", "Victor -3", "Maria 2",};
        String[] expected = {};
        String[] actual = nonStaticGameClassTask20.namesOfSurvivorsNonStatic(names);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void ArrayOfNamesOfSurvivingPlayersRedMaxSpeed2() {
        NonStaticGameClassTask20 nonStaticGameClassTask20 = new NonStaticGameClassTask20(false, 2);

        String[] names = {"Elena 0", "Victor 3", "Maria 2",};
        String[] expected = {"Elena", "Maria"};
        String[] actual = nonStaticGameClassTask20.namesOfSurvivorsNonStatic(names);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void ArrayOfNamesOfSurvivingPlayersGreenMaxSpeed2() {
        NonStaticGameClassTask20 nonStaticGameClassTask20 = new NonStaticGameClassTask20(true, 2);

        String[] names = {"Elena 0", "Victor 3", "Maria 2",};
        String[] expected = {};
        String[] actual = nonStaticGameClassTask20.namesOfSurvivorsNonStatic(names);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void ArrayOfNamesOfSurvivingPlayersRedMaxSpeed5() {
        NonStaticGameClassTask20 nonStaticGameClassTask20 = new NonStaticGameClassTask20(false, 5);

        String[] names = {"Elena 0", "Victor 3", "Maria 2",};
        String[] expected = {"Elena", "Victor", "Maria"};
        String[] actual = nonStaticGameClassTask20.namesOfSurvivorsNonStatic(names);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void ArrayOfNamesOfSurvivingPlayersGreenMaxSpeed5() {
        NonStaticGameClassTask20 nonStaticGameClassTask20 = new NonStaticGameClassTask20(true, 5);

        String[] names = {"Elena 0", "Victor 3", "Maria 2",};
        String[] expected = {};
        String[] actual = nonStaticGameClassTask20.namesOfSurvivorsNonStatic(names);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void ArrayOfNamesOfSurvivingPlayersInRedNegative2Speed() {
        NonStaticGameClassTask20 nonStaticGameClassTask20 = new NonStaticGameClassTask20(false, 0);

        String[] names = {"Elena 0", "Victor -3", "Maria -2",};
        String[] expected = {"Elena"};
        String[] actual = nonStaticGameClassTask20.namesOfSurvivorsNonStatic(names);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void ArrayOfNamesOfSurvivingPlayersInGreenNegative2Speed() {
        NonStaticGameClassTask20 nonStaticGameClassTask20 = new NonStaticGameClassTask20(true, 0);

        String[] names = {"Elena 0", "Victor -3", "Maria -2",};
        String[] expected = {};
        String[] actual = nonStaticGameClassTask20.namesOfSurvivorsNonStatic(names);

        Assertions.assertArrayEquals(expected, actual);

    }
}


