//6510450143 kritt
public class Square {
    private final String _name;
    private int _pos;

    public Square(String name, int pos) {
        this._name = name;
        this._pos = pos;
    }

    public String getName() {
        return this._name;
    }

    public int getPos() {
        return this._pos;
    }

    public void setPos(int pos) {
        this._pos = pos;
    }
}
