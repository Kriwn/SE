//6510450143 kritt
import java.util.ArrayList;

public class Board {
    private final ArrayList<Square> board;

    public Board() {
        board = new ArrayList<>();
        String[] names = {
                "Go", "Mediterranean Avenue", "Community Chest", "Baltic Avenue", "Income Tax", "Reading Railroad",
                "Oriental Avenue", "Chance", "Vermont Avenue", "Connecticut Avenue", "Jail/Just Visiting", "St. Charles Place",
                "Electric Company", "States Avenue", "Virginia Avenue", "Pennsylvania Railroad", "St. James Place", "Community Chest",
                "Tennessee Avenue", "New York Avenue", "Free Parking", "Kentucky Avenue", "Chance", "Indiana Avenue", "Illinois Avenue",
                "B&O Railroad", "Atlantic Avenue", "Ventnor Avenue", "Water Works", "Marvin Gardens", "Go To Jail", "Pacific Avenue",
                "North Carolina Avenue", "Community Chest", "Pennsylvania Avenue", "Short Line", "Chance", "Park Place", "Luxury Tax",
                "Boardwalk"
        };

        int i = 0;
        for (String name : names) {
            board.add(new Square(name, i));
            i++;
        }
    }

    public ArrayList<Square> getBoard() {
        return board;
    }

    public Square getByLocation(int pos) {
        return board.get(pos);
    }

    public Square getSquare(int old, int total)
    {
        int temp = old + total;
        // fix some condition
        while (temp >= board.size())
        {
            temp -= board.size();
        }

        return board.get(temp);
    }
}
