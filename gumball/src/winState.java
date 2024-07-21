// 6510450143 Kritt

public class winState implements State{
    @Override
    public void insertQuarter(GumballMachine gumballMachine) {
        System.out.println("Please wait the gumball come out");
    }

    @Override
    public void ejectQuarter(GumballMachine gumballMachine) {
        System.out.println("You already turn the crank");
    }

    @Override
    public void turnCrank(GumballMachine gumballMachine) {
        System.out.println("You already turn the crank");
    }

    @Override
    public void dispense(GumballMachine gumballMachine) {
        System.out.println("You'RE A WINNER! You get two gumball for your quarter");
        if (gumballMachine.getCount() >= 2)
        {
            gumballMachine.setCount(gumballMachine.getCount() - 2);
            gumballMachine.release();
            gumballMachine.release();
        }
        else if (gumballMachine.getCount() == 1)
        {
            System.out.println("Sorry only one gumball left");
            gumballMachine.setCount(gumballMachine.getCount() - 1);
            gumballMachine.release();
        }
        else
        {
            System.out.println("No gumaballs left");
        }
        if (gumballMachine.getCount() == 0){
            gumballMachine.setState(new outOfGumball());
        }
        else
        {
            gumballMachine.setState(new noQuarter());
        }
    }
}
