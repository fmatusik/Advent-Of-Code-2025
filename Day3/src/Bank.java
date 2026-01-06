import java.util.ArrayList;

public class Bank {
    ArrayList<Integer> vals = new ArrayList<>();
    long joltage;

    void calculateJoltage(){
        int biggestNum = 0;

        for(int i = 0; i<this.vals.size()-1; i++){
            if(biggestNum < this.vals.get(i)) biggestNum = this.vals.get(i);
        }

        System.out.println(biggestNum);

        int indexOfBiggestNum = this.vals.indexOf(biggestNum);

        System.out.println(indexOfBiggestNum);

        int biggestSecond = 0;


        for(int i = indexOfBiggestNum+1; i<this.vals.size(); i++){
            if(biggestSecond < this.vals.get(i)){
                biggestSecond = this.vals.get(i);
            }
        }

        this.joltage = biggestNum*10 + biggestSecond;
    }


    void calculateJoltageP2() {
        int toRemove = vals.size() - 12;

        ArrayList<Integer> stack = new ArrayList<>();

        for (int digit : vals) {
            while (!stack.isEmpty()
                    && toRemove > 0
                    && stack.get(stack.size() - 1) < digit) {
                stack.remove(stack.size() - 1);
                toRemove--;
            }
            stack.add(digit);
        }
        while (toRemove > 0) {
            stack.remove(stack.size() - 1);
            toRemove--;
        }

        long value = 0;
        for (int i = 0; i < 12; i++) {
            value = value * 10 + stack.get(i);
        }

        this.joltage = value;
    }



    int getIndexOfBiggestNum(ArrayList<Integer> values){

        int biggest = 0;
        int index = 0;

        for(int i = 0; i<values.size(); i++) if(values.get(i) > biggest){ biggest=values.get(i); index = i;}

        return index;

    }


}
