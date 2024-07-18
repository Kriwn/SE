// 6510450143 Kritt

public class GumballMachine {
   private int count;
   private State state;

   public GumballMachine(int count) {
       if (count < 0) {
           this.count = 0;
           this.state = new outOfGumball();
       }
       else {
           this.count = count;
           this.state = new noQuarter();
       }
   }

   public void insertQuarter() {
       this.state.insertQuarter(this);
   }

   public void ejectQuarter() {
       this.state.ejectQuarter(this);
   }

   public void turnCrank() {
       this.state.turnCrank(this);
   }

   public void dispense() {
       this.state.dispense(this);
   }

   public void message() {
       System.out.println("Inventory: " + this.getCount() + " gumballs");
       System.out.println("Machine is waiting for a quarter");
       System.out.println();
   }


   public int getCount() {
       return this.count;
   }

   public State getState() {
       return this.state;
   }

   public void setState (State state)
   {
       this.state = state;
   }

   public void  setCount (int Count)
   {
       if (count < 0)
           count = 0;
       this.count = Count;
   }
}
