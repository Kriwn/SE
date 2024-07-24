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
            quacker.quack();
            quacker.quack();
            quackers.removeFirst();
            iterator = quackers.iterator();

        }
        while (iterator.hasNext()) {
            Quackable quacker = (Quackable)iterator.next();
            quacker.quack();
        }
    }
}
