//6510450143 kritt
import java.util.ArrayList;

public class Player {
    public String name;
    private final Dice  _dice1;
    private final Dice _dice2;
    private final Board _board;
    private final Piece piece;

    public Player(String name,Dice dice1,Dice dice2)
    {
        this.name = name;
        this._dice1 = dice1;
        this._dice2 = dice2;
        this._board = new Board();
        this.piece = new Piece(this._board);
    }

    public String getName()
    {
        return this.name;
    }

    public void takeTurn()
    {
        ArrayList<Square> squares = _board.getBoard();
        _dice1.roll();
        _dice2.roll();
        Square oldLoc = piece.getLocation();
        Square newLoc = _board.getSquare(oldLoc.getPos(),_dice1.get_faceValve() + _dice2.get_faceValve());
        piece.setLocation(newLoc.getPos());
        System.out.printf("Player name %s move is %d to location at %s Locationis %d\n",getName(),_dice1.get_faceValve() + _dice2.get_faceValve(), piece.getLocation().getName(),piece.getLocation().getPos());

    }

}
