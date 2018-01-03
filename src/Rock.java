/**
 * Created by michael_hopps on 1/3/18.
 */
public class Rock implements Quantifiable {

    private double weight;

    public Rock(double weight) {
        this.weight = weight;
    }

    @Override
    public double getValue() {
        return weight;
    }
}
