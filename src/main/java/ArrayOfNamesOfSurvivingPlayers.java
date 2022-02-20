public class ArrayOfNamesOfSurvivingPlayers {

    public static boolean IS_GREEN_LIGHT = false;
    public static int MAX_SPEED = 0;

    public static String[] NamesOfSurvivors(String[] names) {
        int newArraySize = 0;

        for (String name : names) {
            String[] parts = name.split(" ");

            int x = Integer.parseInt(parts[1]);
            if (IS_GREEN_LIGHT == false) {
                if (Math.abs(x) <= Math.abs(MAX_SPEED)) {
                    newArraySize++;
                }
            }
        }
        String[] playersName = new String[newArraySize];
        int i = 0;
        for (String name : names) {
            String[] parts = name.split(" ");

            int x = Integer.parseInt(parts[1]);
            if (IS_GREEN_LIGHT == false) {
                if (Math.abs(x) <= Math.abs(MAX_SPEED)) {
                    playersName[i] = parts[0];
                    i++;
                }

            }

        }
        return playersName;
    }
}





