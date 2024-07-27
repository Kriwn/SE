public class PigoenAdpter implements Quackable{
    Pigeon pigeon;

    public PigoenAdpter(Pigeon pigeon){
        this.pigeon = pigeon;
    }

    public void quack(){
        this.pigeon.coo();
    }
}
