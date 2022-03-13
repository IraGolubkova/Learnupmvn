package homework23;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FastPlayerTest {

    @Test
    public void shouldIncreaseSpeedEveryTime(){

        Movable player = new FastPlayer(10, 5);
          assertEquals(10, player.getSpeed());
          assertEquals(15, player.getSpeed());
          assertEquals(20, player.getSpeed());
          assertEquals(25, player.getSpeed());

    }


}