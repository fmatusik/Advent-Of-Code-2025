import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File input = new File("input.txt");
        ArrayList<Interval> intervals = new ArrayList<>();

        try(Scanner sc = new Scanner(input)) {
            String[] intervalsVals = sc.next().split(",");
            for(String intervalVal : intervalsVals) {
                long startVal = Arrays.stream(intervalVal.split("-")).map(Long::parseLong).toList().getFirst();
                long endVal = Arrays.stream(intervalVal.split("-")).map(Long::parseLong).toList().getLast();
                intervals.add(new Interval(startVal, endVal));
            }
        }catch (FileNotFoundException e){
            System.out.println("File input.txt was not wound :(");
        }
        long sum = 0;
        for(Interval interval : intervals){
            System.out.println(interval.startVal + " " + interval.endVal);
            for(long invalid: interval.invalidIDs){
                sum += invalid;
            }
        }

        System.out.println(sum);
    }
}