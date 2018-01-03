/**
 * Created by michael_hopps on 1/3/18.
 */
public class Book implements Quantifiable{

    private int numPages;

    public Book(int numPages) {
        this.numPages = numPages;
    }

    @Override
    public double getValue() {
        return numPages;
    }
}
