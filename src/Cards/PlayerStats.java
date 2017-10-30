package Cards;

public class PlayerStats {
    int overall;
    int pace;
    int dribbling;
    int shooting;
    int defence;
    int passing;
    int physical;

    public PlayerStats(int overall, int pace, int dribbling, int shooting, int defence, int passing, int physical) {
        this.overall = overall;
        this.pace = pace;
        this.dribbling = dribbling;
        this.shooting = shooting;
        this.defence = defence;
        this.passing = passing;
        this.physical = physical;
    }

    public int getOverall() {
        return overall;
    }
}
