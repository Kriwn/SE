// 6510450143 Kritt
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);
        gumballMachine.gumball();
        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();
        gumballMachine.gumball();
        System.out.println("----------------");

        gumballMachine.insertQuarter();
        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();
        gumballMachine.ejectQuarter();
        gumballMachine.gumball();

        System.out.println("----------------");

        GumballMachine a1 = new GumballMachine(-10);
        a1.insertQuarter();
        System.out.println("----------------");

        GumballMachine a2 = new GumballMachine(2);
        a2.insertQuarter();
        a2.turnCrank();
        a2.gumball();
        a2.insertQuarter();
        a2.turnCrank();
        a2.gumball();
        System.out.println("----------------");
    }
}