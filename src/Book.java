/**
 * Created by michael_hopps on 1/3/18.
 */
public class Book implements Quantifiable{

    private int numPages;
    private String title;

    public Book(int numPages, String title) {
        this.numPages = numPages;
        this.title = title;
    }

    @Override
    public double getValue() {
        return numPages;
    }

    public String getTitle(){return title;}
}
