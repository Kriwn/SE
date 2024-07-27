//6510450143 Kritt

public class PoliteDecorator implements Quackable{

    private Quackable quack;

    public PoliteDecorator(Quackable quack) {
        this.quack = quack;
    }


    @Override
    public void quack() {
        quack.quack();
        System.out.print(" ka");
    }
}
