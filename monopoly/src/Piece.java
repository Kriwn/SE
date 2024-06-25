//6510450143 kritt
public class Piece {
    private int _locationg;

    public Piece()
    {
        this._locationg = 0;
    }

    public void setLocation(int  value)
    {
        this._locationg = value;
    }

    public Square getLocation()
    {
        Board board = new Board();
       return board.getByLocation(this._locationg);
    }

}
