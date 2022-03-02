package homework21;

public class SpeedyGame extends Game {
    private int maxSpeed;

    public SpeedyGame(boolean isGreenLight, int maxSpeed) {
        super(isGreenLight);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;

    }

    public void setMaxSpeed(int newMaxSpeed) {
        maxSpeed = newMaxSpeed;

    }

    @Override
    public boolean isFailed(int speed) {
        return (!isGreenLight()) && (Math.abs(speed) > Math.abs(maxSpeed));

    }

}
