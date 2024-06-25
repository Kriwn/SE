//6510450143 kritt
import java.util.ArrayList;

public class MonopolyGame {
    private int _roundCut;
    private ArrayList<Player> players;
    private int _maxNum;
    private Dice _dice1;
    private Dice _dice2;

    public MonopolyGame(int value)
    {
        _dice1 = new Dice();
        _dice2 = new Dice();
        players = new ArrayList<>();

        players.add(new Player("Non", _dice1, _dice2 ));
        players.add(new Player("Ter", _dice1, _dice2 ));
        this._roundCut = value;
        this._maxNum = 2;
    }

    public MonopolyGame(int numPlayer,int value){
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
            playRound();
            i++;
        }
    }

    public ArrayList<Player> getPlayers() {
        return this.players;
    }
}



