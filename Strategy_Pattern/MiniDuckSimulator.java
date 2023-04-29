package Strategy_Pattern;

import Strategy_Pattern.Ducks.Duck;
import Strategy_Pattern.Ducks.MallardDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performQuack();
        mallardDuck.performFly();
    }
}
