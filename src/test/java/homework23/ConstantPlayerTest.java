package homework23;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstantPlayerTest {

    @Test
    public void speedShouldRemainUnchanged(){

        Movable player = new ConstantPlayer(10);
        assertEquals(10, player.getSpeed());
        assertEquals(10, player.getSpeed());
        assertEquals(10, player.getSpeed());
        assertEquals(10, player.getSpeed());

    }

}