import javax.xml.crypto.Data;
import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 * Created by michael_hopps on 1/3/18.
 */
public class DataSetTest {
    public static void main(String[] args) {

        //Books:
        DataSet books = new DataSet();
        books.add(new Book(221, "The Great Gatsby"));
        books.add(new Book(183, "Of Mice and Men"));
        books.add(new Book(369, "The Martian"));
        books.add(new Book(674, "A Game of Thrones"));


        //Rocks:
        DataSet rocks = new DataSet();
        for (int i = 0; i < 20; i++) {
            double weight = (int)((Math.random()*20 + 3)*100)/100.0;  //only wanted 2 decimals
            rocks.add(new Rock(weight));
        }


        //Teams:
        DataSet teams = new DataSet();
        teams.add(new Team("Lightning", 29, 8));
        teams.add(new Team("Bruins", 22, 10));
        teams.add(new Team("Leafs", 23, 16));
        teams.add(new Team("Panthers", 17, 17));
        teams.add(new Team("Red Wings", 15, 16));
        teams.add(new Team("Canadiens", 16, 20));
        teams.add(new Team("Senators", 12, 17));
        teams.add(new Team("Sabres", 10, 20));


    }
}
