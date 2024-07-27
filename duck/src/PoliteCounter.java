//6510450143 Kritt

public class PoliteCounter implements Quackable {
    Quackable duck;
    static int numberOfPoliteQuacks;

    public PoliteCounter (Quackable duck) {
        this.duck = duck;
    }
    public void quack() {
        duck.quack();
        numberOfPoliteQuacks++;
    }
    public static int getQuacks() {
        return numberOfPoliteQuacks;
    }
}
