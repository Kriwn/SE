public class CountingPoliteFactory extends AbstractDuckFactory{

    public Quackable createMallardDuck() {
        return new PoliteCounter(new PoliteDecorator((new MallardDuck())));
    }
    public Quackable createRedheadDuck() {
        return new PoliteCounter(new PoliteDecorator((new RedHeadDuck())));
    }
    public Quackable createDuckCall() {
        return new PoliteCounter(new PoliteDecorator((new DuckCall())));
    }
    public Quackable createRubberDuck() {
        return new PoliteCounter(new PoliteDecorator((new RubberDuck())));
    }
}
