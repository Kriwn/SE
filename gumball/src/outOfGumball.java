public class outOfGumball implements State{
    @Override
    public void insertQuarter(GumballMachine gumballMachine) {
        System.out.println("You can't inserted  a quarter, the machine is sold out");
    }

    @Override
    public void ejectQuarter(GumballMachine gumballMachine) {
        System.out.println("NO Quarter returned");
    }

    @Override
    public void turnCrank(GumballMachine gumballMachine) {
        System.out.println("You turned, but there are no gumballs");
    }

    @Override
    public void dispense(GumballMachine gumballMachine) {
        System.out.println("No quarter exists.");
    }
}
