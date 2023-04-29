package Strategy_Pattern.Quack;

public class MuteQuack implements QuackBehaviour{
    public void quack() {
        System.out.println("Silence");
    }
}
