package workOnBugs19;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NamesOfSurvivingPlayersTest {

    @Test
    public void arrayOfNamesOfSurvivingPlayersIsRed() {

        ArrayOfNamesOfSurvivingPlayers.IS_GREEN_LIGHT = false;
        ArrayOfNamesOfSurvivingPlayers.MAX_SPEED = 0;

        String[] names = {"Elena 0", "Victor 3", "Maria 2",};
        String[] expected = {"Elena"};
        String[] actual = ArrayOfNamesOfSurvivingPlayers.namesOfSurvivors(names);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void arrayOfNamesOfSurvivingPlayersIsGreen() {

        ArrayOfNamesOfSurvivingPlayers.IS_GREEN_LIGHT = true;
        ArrayOfNamesOfSurvivingPlayers.MAX_SPEED = 0;

        String[] names = {"Elena 0", "Victor 3", "Maria 2",};
        String[] expected = {"Elena", "Victor", "Maria"};
        String[] actual = ArrayOfNamesOfSurvivingPlayers.namesOfSurvivors(names);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void arrayOfNamesOfSurvivingPlayersInRedNegativeSpeed() {

        ArrayOfNamesOfSurvivingPlayers.IS_GREEN_LIGHT = false;
        ArrayOfNamesOfSurvivingPlayers.MAX_SPEED = 0;

        String[] names = {"Elena 0", "Victor -3", "Maria 2"};
        String[] expected = {"Elena"};
        String[] actual = ArrayOfNamesOfSurvivingPlayers.namesOfSurvivors(names);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void arrayOfNamesOfSurvivingPlayersInGreenNegativeSpeed() {

        ArrayOfNamesOfSurvivingPlayers.IS_GREEN_LIGHT = true;
        ArrayOfNamesOfSurvivingPlayers.MAX_SPEED = 0;

        String[] names = {"Elena 0", "Victor -3", "Maria 2"};
        String[] expected = {"Elena", "Victor", "Maria"};
        String[] actual = ArrayOfNamesOfSurvivingPlayers.namesOfSurvivors(names);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void arrayOfNamesOfSurvivingPlayersRedMaxSpeed2() {

        ArrayOfNamesOfSurvivingPlayers.IS_GREEN_LIGHT = false;
        ArrayOfNamesOfSurvivingPlayers.MAX_SPEED = 2;

        String[] names = {"Elena 0", "Victor 3", "Maria 2"};
        String[] expected = {"Elena", "Maria"};
        String[] actual = ArrayOfNamesOfSurvivingPlayers.namesOfSurvivors(names);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void arrayOfNamesOfSurvivingPlayersGreenMaxSpeed2() {

        ArrayOfNamesOfSurvivingPlayers.IS_GREEN_LIGHT = true;
        ArrayOfNamesOfSurvivingPlayers.MAX_SPEED = 2;

        String[] names = {"Elena 0", "Victor 3", "Maria 2",};
        String[] expected = {"Elena", "Victor", "Maria"};
        String[] actual = ArrayOfNamesOfSurvivingPlayers.namesOfSurvivors(names);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void arrayOfNamesOfSurvivingPlayersRedMaxSpeed5() {

        ArrayOfNamesOfSurvivingPlayers.IS_GREEN_LIGHT = false;
        ArrayOfNamesOfSurvivingPlayers.MAX_SPEED = 5;

        String[] names = {"Elena 0", "Victor 3", "Maria 2",};
        String[] expected = {"Elena", "Victor", "Maria"};
        String[] actual = ArrayOfNamesOfSurvivingPlayers.namesOfSurvivors(names);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void arrayOfNamesOfSurvivingPlayersGreenMaxSpeed5() {

        ArrayOfNamesOfSurvivingPlayers.IS_GREEN_LIGHT = true;
        ArrayOfNamesOfSurvivingPlayers.MAX_SPEED = 5;

        String[] names = {"Elena 0", "Victor 3", "Maria 2",};
        String[] expected = {"Elena", "Victor", "Maria"};
        String[] actual = ArrayOfNamesOfSurvivingPlayers.namesOfSurvivors(names);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void arrayOfNamesOfSurvivingPlayersInRedNegative2Speed() {

        ArrayOfNamesOfSurvivingPlayers.IS_GREEN_LIGHT = false;
        ArrayOfNamesOfSurvivingPlayers.MAX_SPEED = 0;

        String[] names = {"Elena 0", "Victor -3", "Maria -2",};
        String[] expected = {"Elena"};
        String[] actual = ArrayOfNamesOfSurvivingPlayers.namesOfSurvivors(names);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void arrayOfNamesOfSurvivingPlayersInGreenNegative2Speed() {

        ArrayOfNamesOfSurvivingPlayers.IS_GREEN_LIGHT = true;
        ArrayOfNamesOfSurvivingPlayers.MAX_SPEED = 0;

        String[] names = {"Elena 0", "Victor -3", "Maria -2",};
        String[] expected = {"Elena", "Victor", "Maria"};
        String[] actual = ArrayOfNamesOfSurvivingPlayers.namesOfSurvivors(names);

        Assertions.assertArrayEquals(expected, actual);

    }
}



