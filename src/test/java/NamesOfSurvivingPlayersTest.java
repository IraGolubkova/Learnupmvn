import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NamesOfSurvivingPlayersTest {

    @Test
    public void ArrayOfNamesOfSurvivingPlayersIsRed() {

        ArrayOfNamesOfSurvivingPlayers.IS_GREEN_LIGHT = false;
        ArrayOfNamesOfSurvivingPlayers.MAX_SPEED = 0;

        String[] names = {"Elena 0", "Victor 3", "Maria 2",};
        String[] expected = {"Elena"};
        String[] actual = ArrayOfNamesOfSurvivingPlayers.NamesOfSurvivors(names);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void ArrayOfNamesOfSurvivingPlayersIsGreen() {

        ArrayOfNamesOfSurvivingPlayers.IS_GREEN_LIGHT = true;
        ArrayOfNamesOfSurvivingPlayers.MAX_SPEED = 0;

        String[] names = {"Elena 0", "Victor 3", "Maria 2",};
        String[] expected = {};
        String[] actual = ArrayOfNamesOfSurvivingPlayers.NamesOfSurvivors(names);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void ArrayOfNamesOfSurvivingPlayersInRedNegativeSpeed() {

        ArrayOfNamesOfSurvivingPlayers.IS_GREEN_LIGHT = false;
        ArrayOfNamesOfSurvivingPlayers.MAX_SPEED = 0;

        String[] names = {"Elena 0", "Victor -3", "Maria 2",};
        String[] expected = {"Elena"};
        String[] actual = ArrayOfNamesOfSurvivingPlayers.NamesOfSurvivors(names);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void ArrayOfNamesOfSurvivingPlayersInGreenNegativeSpeed() {

        ArrayOfNamesOfSurvivingPlayers.IS_GREEN_LIGHT = true;
        ArrayOfNamesOfSurvivingPlayers.MAX_SPEED = 0;

        String[] names = {"Elena 0", "Victor -3", "Maria 2",};
        String[] expected = {};
        String[] actual = ArrayOfNamesOfSurvivingPlayers.NamesOfSurvivors(names);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void ArrayOfNamesOfSurvivingPlayersRedMaxSpeed2() {

        ArrayOfNamesOfSurvivingPlayers.IS_GREEN_LIGHT = false;
        ArrayOfNamesOfSurvivingPlayers.MAX_SPEED = 2;

        String[] names = {"Elena 0", "Victor 3", "Maria 2",};
        String[] expected = {"Elena", "Maria"};
        String[] actual = ArrayOfNamesOfSurvivingPlayers.NamesOfSurvivors(names);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void ArrayOfNamesOfSurvivingPlayersGreenMaxSpeed2() {

        ArrayOfNamesOfSurvivingPlayers.IS_GREEN_LIGHT = true;
        ArrayOfNamesOfSurvivingPlayers.MAX_SPEED = 2;

        String[] names = {"Elena 0", "Victor 3", "Maria 2",};
        String[] expected = {};
        String[] actual = ArrayOfNamesOfSurvivingPlayers.NamesOfSurvivors(names);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void ArrayOfNamesOfSurvivingPlayersRedMaxSpeed5() {

        ArrayOfNamesOfSurvivingPlayers.IS_GREEN_LIGHT = false;
        ArrayOfNamesOfSurvivingPlayers.MAX_SPEED = 5;

        String[] names = {"Elena 0", "Victor 3", "Maria 2",};
        String[] expected = {"Elena", "Victor", "Maria"};
        String[] actual = ArrayOfNamesOfSurvivingPlayers.NamesOfSurvivors(names);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void ArrayOfNamesOfSurvivingPlayersGreenMaxSpeed5() {

        ArrayOfNamesOfSurvivingPlayers.IS_GREEN_LIGHT = true;
        ArrayOfNamesOfSurvivingPlayers.MAX_SPEED = 5;

        String[] names = {"Elena 0", "Victor 3", "Maria 2",};
        String[] expected = {};
        String[] actual = ArrayOfNamesOfSurvivingPlayers.NamesOfSurvivors(names);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void ArrayOfNamesOfSurvivingPlayersInRedNegative2Speed() {

        ArrayOfNamesOfSurvivingPlayers.IS_GREEN_LIGHT = false;
        ArrayOfNamesOfSurvivingPlayers.MAX_SPEED = 0;

        String[] names = {"Elena 0", "Victor -3", "Maria -2",};
        String[] expected = {"Elena"};
        String[] actual = ArrayOfNamesOfSurvivingPlayers.NamesOfSurvivors(names);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void ArrayOfNamesOfSurvivingPlayersInGreenNegative2Speed() {

        ArrayOfNamesOfSurvivingPlayers.IS_GREEN_LIGHT = true;
        ArrayOfNamesOfSurvivingPlayers.MAX_SPEED = 0;

        String[] names = {"Elena 0", "Victor -3", "Maria -2",};
        String[] expected = {};
        String[] actual = ArrayOfNamesOfSurvivingPlayers.NamesOfSurvivors(names);

        Assertions.assertArrayEquals(expected, actual);

    }
}



