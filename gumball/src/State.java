public interface State {
    void insertQuarter(GumballMachine gumballMachine);
    void ejectQuarter(GumballMachine gumballMachine);
    void turnCrank(GumballMachine gumballMachine);
    void dispense(GumballMachine gumballMachine);
}
