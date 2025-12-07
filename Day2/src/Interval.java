import java.util.ArrayList;
import java.util.Objects;

public class Interval {
    long startVal;
    long endVal;
    ArrayList<Long> invalidIDs = new ArrayList<>();

    public Interval(long startVal, long endVal) {
        this.startVal = startVal;
        this.endVal = endVal;
        setInvalidIDs();
    }
    //for part 1
    private void setInvalidIDs(){
        for(long i = startVal; i<=endVal; i++){
            String numString = Long.toString(i);
            final int mid = numString.length() / 2;
            String[] parts = {numString.substring(0, mid),numString.substring(mid)};
            if(parts[0].equals(parts[1])) invalidIDs.add(i);
        }
    }




}
