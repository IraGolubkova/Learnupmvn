import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NamesOfSurvivingPlayersTest {

    @Test
    public void ArrayOfNamesOfSurvivingPlayersTest() {

        ArrayOfNamesOfSurvivingPlayers.IS_GREEN_LIGHT = false;
        ArrayOfNamesOfSurvivingPlayers.MAX_SPEED = 0;

        String[] names = {"Elena 0", "Victor 3", "Maria 2",};
        String[] expected = {"Elena"};
        String[] actual = ArrayOfNamesOfSurvivingPlayers.NamesOfSurvivors(names);

        Assertions.assertArrayEquals(expected, actual);

    }
}


