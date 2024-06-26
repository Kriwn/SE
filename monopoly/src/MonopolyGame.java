//6510450143 kritt
import java.util.ArrayList;

public class MonopolyGame {
    private final int _roundCut;
    private final ArrayList<Player> players;
    private final int _maxNum;
    private final Dice _dice1;
    private final Dice _dice2;

    public MonopolyGame(int value)
    {
        if (value <= 0) {
            System.err.println("MonopolyGame round should be greater than 0");
            System.exit(22);
        }
        _dice1 = new Dice();
        _dice2 = new Dice();
        players = new ArrayList<>();

        players.add(new Player("Non", _dice1, _dice2 ));
        players.add(new Player("Ter", _dice1, _dice2 ));
        this._roundCut = value;
        this._maxNum = 2;
    }

    public MonopolyGame(int numPlayer,int value){
        if (numPlayer < 2 || numPlayer > 8 || value <= 0)
        {
            System.err.println("Invalid number of players or round cut");
            System.exit(22);
        }
        String name[] = {"Non", "Ter", "Big", "Boss", "Palm", "Sun", "Mint", "Peak"};
        players = new ArrayList<>();
        _dice1 = new Dice();
        _dice2 = new Dice();
        for(int i = 0; i < numPlayer; i++)
        {
            players.add(new Player(name[i], _dice1, _dice2));
        }
        this._roundCut = value;
        this._maxNum = numPlayer;
    }

    private void playRound(){
        for(int i =0; i < this._maxNum;i++)
        {
            players.get(i).takeTurn();
        }
    }

    public  void playGame(){
        System.out.printf("Start Game ALL player start at Go\n");
        for (int i = 0; i < this._roundCut; i++) {
            System.out.println("Start Round " + i);
            playRound();
        }
    }

    public ArrayList<Player> getPlayers() {
        return this.players;
    }
}



