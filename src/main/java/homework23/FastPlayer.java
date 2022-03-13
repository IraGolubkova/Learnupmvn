package homework23;

public class FastPlayer implements Movable {
   private int currentSpeed;
    private final int speedStep;

    public FastPlayer(int startSpeed, int speedStep) {
        this.currentSpeed = startSpeed;
        this.speedStep = speedStep;
    }

    @Override
    public int getSpeed() {
        int resultSpeed = currentSpeed;
        currentSpeed += speedStep;
        return resultSpeed;
    }
}
