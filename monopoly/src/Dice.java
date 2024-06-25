//6510450143 kritt
public class Dice {

    private int _faceValve;


    public int get_faceValve() {
        return _faceValve;
    }

    public void set_faceValve(int valve)
    {
        this._faceValve = valve;
    }

    public  Dice()
    {
        this._faceValve = 0;
    }
    public  void roll()
    {
        int max = 6;
        int min = 1;
        set_faceValve((int) ((Math.random() * (max - min)) + min));
    }
}
