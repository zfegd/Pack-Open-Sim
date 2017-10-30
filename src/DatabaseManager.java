import Cards.Player;

import java.util.HashMap;
import java.util.Map;

public class DatabaseManager {
    private HashMap<Integer, Player> cards;
    private int nextUsedID;

    public DatabaseManager() {
        this.cards = new HashMap<Integer, Player>();
        this.nextUsedID = 0;
    }

    public void populate(Player player){
        player.setCardID(nextUsedID);
        cards.put(nextUsedID, player);
        nextUsedID++;
    }

    public void print(){
        for(Map.Entry<Integer, Player> entry : cards.entrySet()){
            System.out.println(entry.getValue());
        }
    }

    public HashMap<Integer, Player> getCards() {
        return cards;
    }
}
