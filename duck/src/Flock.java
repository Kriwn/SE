//6510450143 Kritt

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable{
    ArrayList quackers = new ArrayList();

    public void add(Quackable quacker) {
        quackers.add(quacker);
    }

    public void quack() {
        Iterator iterator = quackers.iterator();
        if (!quackers.isEmpty()) {
            Quackable quacker =  (Quackable)quackers.getFirst();

            System.out.println("First Flock");
            quacker.quack();
            System.out.println();

            quacker.quack();
            System.out.println();

            quacker.quack();
            System.out.println();

            quackers.removeFirst();
            iterator = quackers.iterator();

        }
        while (iterator.hasNext()) {
            Quackable quacker = (Quackable)iterator.next();
            quacker.quack();
            System.out.println();
        }
    }
}
