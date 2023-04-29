package Strategy_Pattern.Ducks;

import Strategy_Pattern.Fly.FlyBehaviour;
import Strategy_Pattern.Quack.QuackBehaviour;

public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public Duck() {}
    public abstract void display();

    public void performQuack() {
        quackBehaviour.quack();
    }
    public void performFly() {
        flyBehaviour.fly();
    }
    public void swim() {
        System.out.println("All ducks floats, even decoys!");
    }
}