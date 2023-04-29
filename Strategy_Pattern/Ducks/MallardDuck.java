package Strategy_Pattern.Ducks;

import Strategy_Pattern.Fly.FlyWithWings;
import Strategy_Pattern.Quack.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    public void display() {
        System.out.println("I am a real Mallard duck");
    }
}