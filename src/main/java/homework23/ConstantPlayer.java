package homework23;

public class ConstantPlayer implements Movable {

    protected int speedOfPlayer;

    public ConstantPlayer(int speedOfPlayer) {
        this.speedOfPlayer = speedOfPlayer;
    }

    @Override
    public int getSpeed() {
        return speedOfPlayer;
    }
}





//
//    Создайте интерфейс `Movable` описывающий все сущности, которые имеют скорость (у
//        нас это игроки) с единственным методом `getSpeed()`.
//        Создайте имплементирующий интерфейс `Movable` класс `ConstantPlayer` - класс игрока,
//        который передвигается всегда с одной скоростью, которая была указана ему в
//        конструкторе.
//        Создайте имплементирующий интерфейс `Movable` класс `FastPlayer` - класс игрока с
//        конструктором `FastPlayer(int startSpeed, int speedStep)`, который при каждом вызове
//        метода `getSpeed()` увеличивает свою скорость на `speedStep`, начиная с `startSpeed`.
//        Например:
//        ```
//        Movable player = new FastPlayer(10, 5);
//        player.getSpeed(); // 10
//        player.getSpeed(); // 15
//        player.getSpeed(); // 20
//        player.getSpeed(); // 25
//        ```
//        Добавьте в менеджер игры метод `int loser(Movable p1, Movable p2, Game game, int
//        rounds)`, который
//        * возвращает -1, если p1 проиграет раньше в игру game если будет rounds раундов;
//        * возвращает 1, если p2 проиграет раньше в игру game если будет rounds раундов;
//        * возвращает 0, если никто не успеет проиграть
//        Добавьте тесты, коммит, пуш, зелёная Github Actions CI