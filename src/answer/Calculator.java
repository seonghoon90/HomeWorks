package answer;

import java.util.ArrayList;
import java.util.List;

public abstract class Calculator {

    public static final double PI = 3.14;

    private final List<Double> results;

    public Calculator(List<Double> results) {
        this.results = results;
    }

    public void removeResult(int index){
        this.results.remove(index);
    }

    abstract void inquiryResult();

    public List<Double> getResults() {
        return results;
    }
}
