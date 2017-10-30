package Packs;

import Cards.Player;

import java.util.HashMap;
import java.util.Map;

public abstract class Pack {

    HashMap<Integer, Player> db;
    int[] packweights;

    // NEED to handle Overflow
    public Pack(HashMap<Integer, Player> db) {
        this.db = db;
        int arrsize = 0;
        for(Map.Entry<Integer, Player> entry : db.entrySet()){
            arrsize = arrsize + entry.getValue().getPackWeight();
        }
        packweights = new int[arrsize];
        int traverseIndex = 0;
        for(Map.Entry<Integer, Player> entry : db.entrySet()){
            int multipletimes = entry.getValue().getPackWeight();
            for(int i=0; i<multipletimes; i++){
                packweights[traverseIndex] = entry.getKey();
                traverseIndex++;
            }
        }
    }

    public abstract void getPack();
}
