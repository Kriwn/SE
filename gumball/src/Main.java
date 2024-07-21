// 6510450143 Kritt
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(10);


        gumballMachine.message();
        gumballMachine.ejectQuarter();
        gumballMachine.turnCrank();
        gumballMachine.dispense();


        gumballMachine.message();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.dispense();

        gumballMachine.message();
        gumballMachine.insertQuarter();
        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.dispense();

        gumballMachine.message();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.dispense();

//        gumballMachine.message();
//        gumballMachine.chooseFlavor("Orange");
//        gumballMachine.chooseFlavor("Mango");
//        gumballMachine.insertQuarter();
//        gumballMachine.turnCrank();
//        gumballMachine.dispense();

    }
}