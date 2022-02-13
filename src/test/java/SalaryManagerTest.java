import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SalaryManagerTest {

    @Test
    public void shouldCalculateForDayOff() {
        SalaryManager.isDayOff = true;

        int expected = 3_000;
        int actual = SalaryManager.getDaySalary(40_000);

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void shouldCalculateForMonday() {
        SalaryManager.isDayOff = false;

        int expected = 2_000;
        int actual = SalaryManager.getDaySalary(40_000);

        Assertions.assertEquals(expected, actual);

    }
}
