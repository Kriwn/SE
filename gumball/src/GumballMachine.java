// 6510450143 Kritt

import java.util.Random;

public class GumballMachine {
   private int count;
   private State state;
   private String flavor;
   private static final double JACKPOT_RATE = 0.1;


    public GumballMachine(int count) {
       if (count < 0) {
           this.count = 0;
           this.state = new outOfGumball();
       }
       else {
           this.count = count;
           this.state = new noQuarter();
       }
       this.flavor = "Mango";
   }

   public void chooseFlavor(String flavor)
   {
       this.flavor = flavor;
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

   public void release()
   {
       System.out.println("A gumball come out the slot");
       System.out.println("You got "+ this.getFlavor());
   }

   public int getCount() {
       return this.count;
   }

   public State getState() {
       return this.state;
   }

   public String getFlavor() {
       return this.flavor;
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

    public boolean isJackpot() {
        Random random = new Random();
        return random.nextDouble() < JACKPOT_RATE;
    }
}
