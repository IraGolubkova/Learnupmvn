package homework20;

public class NonStaticGameClassTask20 {

    public boolean IS_GREEN_LIGHT;
    public  int MAX_SPEED;

    public NonStaticGameClassTask20(boolean IS_GREEN_LIGHT, int MAX_SPEED) {
        this.IS_GREEN_LIGHT = IS_GREEN_LIGHT;
        this.MAX_SPEED = MAX_SPEED;
    }

    public String[] namesOfSurvivorsNonStatic(String[] names) {                      //массив строк вида “имя скорость” и возвращать массив имён выживших игроков.
        int newArraySize = 0;

        for (String name : names) {
            String[] parts = name.split(" ");

            int x = Integer.parseInt(parts[1]);
            if (!IS_GREEN_LIGHT) {
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
            if (!IS_GREEN_LIGHT) {
                if (Math.abs(x) <= Math.abs(MAX_SPEED)) {
                    playersName[i] = parts[0];
                    i++;
                }

            }

        }
        return playersName;
    }

    //количество выбывающих при красном свете;
    public int numberOfDropouts(int[] speedOfPlayer) {
        int countOfPlayers = 0;
        for (int i = 0; i != speedOfPlayer.length; ++i) {

            if (isPlayerDroppedOut(speedOfPlayer[i])) {
                ++countOfPlayers;

            }

        }
        return countOfPlayers;
    }

    public boolean isPlayerDroppedOut(int speedOfPlayer) {

        if (!IS_GREEN_LIGHT) {
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
    public int[] speedsOfDropped(int[] speedOfPlayer) {

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
    public int[] speedsOfNotDropped(int[] speedOfPlayer) {

        int cnt = speedOfPlayer.length - numberOfDropouts(speedOfPlayer);

        int[] result = new int[cnt];
        int resultCount = 0;
        for (int i = 0; i != speedOfPlayer.length; ++i) {

            if (!isPlayerDroppedOut(speedOfPlayer[i])) {
                result[resultCount] = speedOfPlayer[i];
                ++resultCount;


            }

        }
        return result;
    }


}
//Переделайте ваш класс игры со статических членов класса на нестатические. Состояние
//игры (красный или зелёный свет) теперь должно храниться в нестатическом поле, а не в
//статическом. Задаваться начальное состояние света должно в конструкторе. Все методы
//должны быть теперь нестатические. Адаптируйте под новый синтаксис класса игры тесты.