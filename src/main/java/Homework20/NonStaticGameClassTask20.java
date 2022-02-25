package Homework20;

public class NonStaticGameClassTask20 {

    public static boolean IS_GREEN_LIGHT = false;
    public static int MAX_SPEED = 0;

    public NonStaticGameClassTask20(boolean IS_GREEN_LIGHT, int MAX_SPEED) {
        this.IS_GREEN_LIGHT = IS_GREEN_LIGHT;
        this.MAX_SPEED = MAX_SPEED;
    }

    public static String[] namesOfSurvivorsNonStatic(String[] names) {                      //массив строк вида “имя скорость” и возвращать массив имён выживших игроков.
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

    //количество выбывающих при красном свете;
    public static int numberOfDropouts(int[] speedOfPlayer) {
        int countOfPlayers = 0;
        for (int i = 0; i != speedOfPlayer.length; ++i) {

            if (isPlayerDroppedOut(speedOfPlayer[i])) {
                ++countOfPlayers;

            }

        }
        return countOfPlayers;
    }

    public static boolean isPlayerDroppedOut(int speedOfPlayer) {

        if (IS_GREEN_LIGHT == false) {
            if (Math.abs(speedOfPlayer) > Math.abs(MAX_SPEED)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    //массив из скоростей выбывающих
    public static int[] speedsOfDropped(int[] speedOfPlayer) {

        int cnt = numberOfDropouts(speedOfPlayer);

        int[] result = new int[cnt];
        int resultCount = 0;
        for (int i = 0; i != speedOfPlayer.length; ++i) {

            if (isPlayerDroppedOut(speedOfPlayer[i])) {
                result[resultCount] = speedOfPlayer[i];
                ++resultCount;


            }

        }
        return result;
    }

    //массив из скоростей не выбывающих
    public static int[] speedsOfNotDropped(int[] speedOfPlayer) {

        int cnt = speedOfPlayer.length - numberOfDropouts(speedOfPlayer);

        int[] result = new int[cnt];
        int resultCount = 0;
        for (int i = 0; i != speedOfPlayer.length; ++i) {

            if (isPlayerDroppedOut(speedOfPlayer[i]) == false) {
                result[resultCount] = speedOfPlayer[i];
                ++resultCount;


            }

        }
        return result;
    }


}
