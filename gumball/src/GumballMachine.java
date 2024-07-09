public class GumballMachine {
   private int count;
   private String state;

    public GumballMachine(int value){
        this.count = value;
        if (value > 0)
            this.state = "No Quarter";
        else {
            this.state = "Sold Out";
            this.count = 0;
        }
    };

    public void setState(String state){
        this.state = state;
    }

    public void insertQuarter(){
        if (this.state.equals("No Quarter")){
            System.out.println("You inserted a quarter");
            setState("Has Quarter");
        }
        else if (this.state.equals("Has Quarter")){
            System.out.println("You can't inserted another  quarter");
        }
        else if (this.state.equals("Sold Out")){
            System.out.println("You can't inserted  a quarter, the machine is sold out");
        }
    }

    public void ejectQuarter(){
        if (this.state.equals("Has Quarter")){
            System.out.println("Quarter returned");
        }
        setState("No Quarter");
    }

    public void turnCrank(){
        System.out.println("You turned...");
        if (this.state.equals("Has Quarter")){
            setState("Gumball Sold");
            dispense();
        }
        else if (this.state.equals("No Quarter")){
            System.out.println("You turned,but there are no quarter");
        }
        else if (this.state.equals("Sold Out")){
            System.out.println("You turned,but there are no gumball");
        }

    }

    public void dispense(){
        if (this.count <= 0){
            System.out.println("A gumball is out of ");
            setState("Sold Out");
            this.count = 0;
        }
        else {
            this.count -= 1;
            System.out.println("A gumball rolling out the slot");
            setState("No Quarter");
        }
    }

    public void gumball(){
        if (this.state.equals("No Quarter")) {
            System.out.println("Inventory: " + this.count + " gumballs");
            System.out.println("Machine waiting for quarter");
        }
        else if (this.state.equals("Sold Out")) {
            System.out.println("Inventory: " + this.count + " gumballs");
            System.out.println("Machine Sold Out");
        }
    }
}
