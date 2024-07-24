//public class DuckSimulator {
//    public static void main(String[] args) {
//        DuckSimulator simulator = new DuckSimulator();
//        simulator.simulate();
//    }
//    void simulate() {
//        Quackable mallardDuck = new MallardDuck();
//        Quackable redheadDuck = new RedheadDuck();
//        Quackable duckCall = new DuckCall();
//        Quackable rubberDuck = new RubberDuck();
//        System.out.println(“\nDuck Simulator”);
//        simulate(mallardDuck);
//        simulate(redheadDuck);
//        simulate(duckCall);
//        simulate(rubberDuck);
//    }
//    void simulate(Quackable duck) {
//        duck.quack();
//    }
//}

//public class DuckSimulator {
//    public static void main(String[] args) {
//        DuckSimulator simulator = new DuckSimulator();
//        simulator.simulate();
//    }
//
//    void simulate() {
//        Quackable mallardDuck = new MallardDuck();
//        Quackable redheadDuck = new RedheadDuck();
//        Quackable duckCall = new DuckCall();
//        Quackable rubberDuck = new RubberDuck();
//        Quackable gooseDuck = new GooseAdapter(new Goose());
//        System.out.println(“\nDuck Simulator:With Goose Adapter”);
//        simulate(mallardDuck);
//        simulate(redheadDuck);
//        simulate(duckCall);
//        simulate(rubberDuck);
//        simulate(gooseDuck);
//    }
//}

//public class DuckSimulator {
//    public static void main(String[] args) {
//        DuckSimulator simulator = new DuckSimulator();
//        simulator.simulate();
//    }
//
//    void simulate() {
//        Quackable mallardDuck =new QuackCounter(new MallardDuck());
//        Quackable redheadDuck = new QuackCounter(new RedHeadDuck());
//        Quackable duckCall = new QuackCounter(new DuckCall());
//        Quackable rubberDuck = new QuackCounter(new RubberDuck());
//        Quackable gooseDuck = new GooseAdapter(new Goose());
//
//        System.out.println("\nDuck Simulator with Decorator\n");
//
//        simulate(mallardDuck);
//        simulate(redheadDuck);
//        simulate(duckCall);
//        simulate(rubberDuck);
//        simulate(gooseDuck);
//    }
//
//    void simulate(Quackable duck) {
//        duck.quack();
//    }
//}


//public class DuckSimulator {
//    public static void main(String[] args) {
//        DuckSimulator simulator = new DuckSimulator();
//        AbstractDuckFactory duckFactory = new CountingDuckFactory();
//        simulator.simulate(duckFactory);
//    }
//
//    void simulate(AbstractDuckFactory   duckFactory) {
//        Quackable mallardDuck = duckFactory.createMallardDuck();
//        Quackable redheadDuck = duckFactory.createRedheadDuck();
//        Quackable duckCall = duckFactory.createDuckCall();
//        Quackable rubberDuck = duckFactory.createRubberDuck();
//        Quackable gooseDuck = new GooseAdapter(new Goose());
//
//        System.out.println("\nDuck Simulator with Factory\n");
//
//        simulate(mallardDuck);
//        simulate(redheadDuck);
//        simulate(duckCall);
//        simulate(rubberDuck);
//        simulate(gooseDuck);
//    }
//
//    void simulate(Quackable duck) {
//        duck.quack();
//    }
//}


public class DuckSimulator {

        public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        simulator.simulate(duckFactory);
    }
    // main method here
    void simulate(AbstractDuckFactory   duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());

        System.out.println("\nDuck Simulator with Factory\n");

        Flock flock = new Flock();

        flock.add(mallardDuck);
        flock.add(redheadDuck);
        flock.add(duckCall);
        flock.add(rubberDuck);
        flock.add(gooseDuck);

        flock.quack();
    }
    void simulate(Quackable duck) {
        duck.quack();
    }
}