package Strategy_Pattern.Ducks;

import Strategy_Pattern.Fly.FlyNoWay;
import Strategy_Pattern.Quack.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        quackBehaviour = new Squeak();
        flyBehaviour = new FlyNoWay();
    }

    public void display() {
        System.out.println("I am a real Rubber duck");
    }
}
