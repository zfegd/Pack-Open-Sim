import Cards.Player;
import Cards.PlayerStats;
import Cards.Rarities;
import Packs.OnePlayerGoldPack;
import Packs.Pack;

public class ManualDB {

    private DatabaseManager db;

    public ManualDB() {
        db = new DatabaseManager();
        addPSG();
        // Manually add stuff
    }

    private void addPSG(){
        PlayerStats cavanistats = new PlayerStats(86, 85, 80, 89, 20, 78, 84);
        Player cavani = new Player("Edison Cavani", "PSG", Rarities.GOLD_RARE, cavanistats, 10);
        db.populate(cavani);
        PlayerStats neymarstats = new PlayerStats(92, 90, 92, 88, 23, 88, 84);
        Player neymar = new Player("Neymar JR", "PSG", Rarities.GOLD_RARE, neymarstats, 1);
        db.populate(neymar);
        PlayerStats mbappestats = new PlayerStats(80, 88, 82, 86, 20, 78, 77);
        Player mbappe = new Player("Kylian Mbappe Lottin", "PSG", Rarities.GOLD_RARE, mbappestats, 19);
        db.populate(mbappe);
        PlayerStats dimariastats = new PlayerStats(83, 82, 87, 79, 20, 78, 84);
        Player dimaria = new Player("Angel Di Maria", "PSG", Rarities.GOLD_RARE, cavanistats, 12);
        db.populate(dimaria);
        PlayerStats cavaniIF1stats = new PlayerStats(87, 88, 83, 96, 22, 84, 90);
        Player cavaniIF1 = new Player("Edison Cavani", "PSG", Rarities.GOLD_TOTW, cavanistats, 3);
        db.populate(cavaniIF1);
    }

    public void print(){
        db.print();
    }

    public void getPack(){
        Pack pack = new OnePlayerGoldPack(db.getCards());
        pack.getPack();
    }
}
