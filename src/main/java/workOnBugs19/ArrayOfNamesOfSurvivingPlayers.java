package workOnBugs19;
public class ArrayOfNamesOfSurvivingPlayers {

    public static boolean IS_GREEN_LIGHT = false;
    public static int MAX_SPEED = 0;

    public static String[] namesOfSurvivors(String[] names) {
        int newArraySize = 0;

        for (String name : names) {
            String[] parts = name.split(" ");

            int speed = Integer.parseInt(parts[1]);
            if (isPlayerSurvive(speed)) {
                newArraySize++;
            }
        }
        String[] playersName = new String[newArraySize];
        int i = 0;
        for (String name : names) {
            String[] parts = name.split(" ");

            int speed = Integer.parseInt(parts[1]);
            if (isPlayerSurvive(speed)) {
                playersName[i] = parts[0];
                i++;
            }
        }
        return playersName;
    }

    private static boolean isPlayerSurvive(int speed) {
        if (!IS_GREEN_LIGHT) {
            return Math.abs(speed) <= Math.abs(MAX_SPEED);
        } else {
            return true;
        }
    }
}
