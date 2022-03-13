package homework23;

public class Game {

    private boolean isGreenLight;

    public Game(boolean isGreenLight) {
        this.isGreenLight = isGreenLight;

    }

    public boolean isGreenLight() {
        return isGreenLight;

    }

    public void setGreenLight(boolean newIsGreenLight) {
        isGreenLight = newIsGreenLight;

    }

    public boolean isFailed(int speed) {
        return !isGreenLight && speed != 0;

    }
}
