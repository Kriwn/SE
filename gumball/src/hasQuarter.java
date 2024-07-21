// 6510450143 Kritt

public class hasQuarter implements State{


    @Override
    public void insertQuarter(GumballMachine gumballMachine) {
        System.out.println("You can't inserted another  quarter");
    }

    @Override
    public void ejectQuarter(GumballMachine gumballMachine) {
        System.out.println("Quarter returned");
        gumballMachine.setState(new noQuarter());
    }

    @Override
    public void turnCrank(GumballMachine gumballMachine) {
        System.out.println("You turned...");
        if (gumballMachine.isJackpot())
        {
            gumballMachine.setState(new winState());
        }
        else {
            gumballMachine.setState(new gumballSold());
        }
    }

    @Override
    public void dispense(GumballMachine gumballMachine) {
        System.out.println("Turn Crank first");
    }
}
