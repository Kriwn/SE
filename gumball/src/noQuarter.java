// 6510450143 Kritt

public class noQuarter implements State{
    @Override
    public void insertQuarter(GumballMachine gumballMachine) {
        System.out.println("You inserted a quarter");
        gumballMachine.setState(new hasQuarter());
    }

    @Override
    public void ejectQuarter(GumballMachine gumballMachine) {
        System.out.println("No quarter exists");

    }

    @Override
    public void turnCrank(GumballMachine gumballMachine) {
        System.out.println("You haven't inserted a quarter");
    }

    @Override
    public void dispense(GumballMachine gumballMachine) {
        System.out.println("No quarter exists");
    }
}
