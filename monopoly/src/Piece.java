//6510450143 kritt
public class Piece {
    private int _locationg;
    private final Board _board;

    public Piece(Board _board)
    {
        this._board = _board;
        this._locationg = 0;
    }

    public void setLocation(int  value)
    {
        this._locationg = value;
    }

    public Square getLocation()
    {
       return this._board.getByLocation(this._locationg);
    }

}
