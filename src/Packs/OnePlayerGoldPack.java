package Packs;

import Cards.Player;
import Cards.Rarities;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class OnePlayerGoldPack extends Pack{

    public OnePlayerGoldPack(HashMap<Integer, Player> db) {
        super(db);
        int arrsize = 0;
        for(Map.Entry<Integer, Player> entry : db.entrySet()){
            if(entry.getValue().getRarity() == Rarities.GOLD_RARE || entry.getValue().getRarity() == Rarities.GOLD_NON_RARE || entry.getValue().getRarity() == Rarities.GOLD_TOTW ){
                arrsize = arrsize + entry.getValue().getPackWeight();
            }
        }
        packweights = new int[arrsize];
        int traverseIndex = 0;
        for(Map.Entry<Integer, Player> entry : db.entrySet()){
            if(entry.getValue().getRarity() == Rarities.GOLD_RARE || entry.getValue().getRarity() == Rarities.GOLD_NON_RARE || entry.getValue().getRarity() == Rarities.GOLD_TOTW ) {
                int multipletimes = entry.getValue().getPackWeight();
                for (int i = 0; i < multipletimes; i++) {
                    packweights[traverseIndex] = entry.getKey();
                    traverseIndex++;
                }
            }
        }
    }

    @Override
    public void getPack() {
        int randLocation = new Random().nextInt(packweights.length);
        Player gotPlayer = db.get(packweights[randLocation]);
        System.out.println(gotPlayer);
    }
}
