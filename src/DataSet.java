import java.util.ArrayList;

/**
 * Created by michael_hopps on 1/3/18.
 */
public class DataSet {

    private ArrayList<Quantifiable> set;

    public DataSet(){
        set = new ArrayList<>();
    }

    public void addItem(Quantifiable newItem){
        set.add(newItem);
    }

    public double getMean(){

        return 0;
    }

    public Quantifiable getMaxItem(){

        return null;
    }

    public Quantifiable getMaxValue(){

        return null;
    }



}
