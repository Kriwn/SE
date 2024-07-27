//6510450143 Kritt

import java.util.Random;

public class Pigeon {
    private static final double COO_RATE = 0.2;

    public void coo() {
        Random random = new Random();
       if (random.nextDouble() < COO_RATE) {
           System.out.print("quack");
       }
       else {
           System.out.print("coo ");
           System.out.print("coo");
       }
    }
}
