public class gumballSold implements State{
    @Override
    public void insertQuarter(GumballMachine gumballMachine) {
        System.out.println("You can't insert a quarter wait a gumball come out");
    }

    @Override
    public void ejectQuarter(GumballMachine gumballMachine) {
        System.out.println("You can't eject quarter");

    }

    @Override
    public void turnCrank(GumballMachine gumballMachine) {
        System.out.println("You already turned the gumball machine");
    }

    @Override
    public void dispense(GumballMachine gumballMachine) {
        if (gumballMachine.getCount() == 1) {
            gumballMachine.setCount(gumballMachine.getCount() - 1);
            gumballMachine.release();
            System.out.println("Oops, out of gumball!");
            gumballMachine.setState(new outOfGumball());
        }
        else
        {
            gumballMachine.setCount(gumballMachine.getCount() - 1);
            gumballMachine.release();
            gumballMachine.setState(new noQuarter());
        }
    }
}
