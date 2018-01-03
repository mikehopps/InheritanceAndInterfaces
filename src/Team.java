/**
 * Created by michael_hopps on 1/3/18.
 */
public class Team implements Quantifiable{

    private int wins, losses;
    private String name;

    public Team(String name, int wins, int losses) {
        this.wins = wins;
        this.losses = losses;
        this.name = name;
    }

    /*
    Value is the team's winning percentage.
     */
    @Override
    public double getValue() {
        return (double)wins/(wins + losses);
    }

    public String getName() {
        return name;
    }
}
