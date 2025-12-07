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
/*    private void setInvalidIDs(){
        for(long i = startVal; i<=endVal; i++){
            String numString = Long.toString(i);
            final int mid = numString.length() / 2;
            String[] parts = {numString.substring(0, mid),numString.substring(mid)};
            if(parts[0].equals(parts[1])) invalidIDs.add(i);
        }
    }*/

    //for part 2
    private void setInvalidIDs() {
        for (long i = startVal; i <= endVal; i++) {
            String s = Long.toString(i);
            int n = s.length();

            ArrayList<Integer> divisors = new ArrayList<>();
            for (int d = 1; d <= n; d++) {
                if (n % d == 0) {
                    divisors.add(d);
                }
            }

            for (int partLen : divisors) {
                if (partLen == n) continue;

                String firstPart = s.substring(0, partLen);
                boolean isRepeating = true;

                for (int start = partLen; start < n; start += partLen) {
                    if (!s.substring(start, start + partLen).equals(firstPart)) {
                        isRepeating = false;
                        break;
                    }
                }

                if (isRepeating) {
                    invalidIDs.add(i);
                    break;
                }
            }
        }
    }


}
