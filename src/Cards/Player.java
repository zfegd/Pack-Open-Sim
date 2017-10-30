package Cards;

public class Player implements Card{

    String playername;
    String playerclub;
    Rarities rarity;
    private PlayerStats stats;
    private int packWeight;
    private int cardID;

    public Player(String playername, String playerclub, Rarities rarity, PlayerStats stats, int packWeight) {
        this.playername = playername;
        this.playerclub = playerclub;
        this.rarity = rarity;
        this.stats = stats;
        this.packWeight = packWeight;
    }

    @Override
    public Rarities getRarity() {
        return rarity;
    }

    @Override
    public int getPackWeight() {
        return packWeight;
    }

    public int getOverall(){
        return stats.getOverall();
    }

    public void setCardID(int id){
        this.cardID = id;
    }

    @Override
    public String toString(){
        String toprint = "Name: \t\t" + playername + "\nClub: \t\t" + playerclub + "\nOverall: \t" + getOverall() + "\n";
        if(rarity == Rarities.BRONZE_TOTW || rarity ==  Rarities.SILVER_TOTW || rarity == Rarities.GOLD_TOTW){
            toprint = toprint + "\t!!! TOTW CARD !!!\n";
        }
        return toprint;
    }
}
