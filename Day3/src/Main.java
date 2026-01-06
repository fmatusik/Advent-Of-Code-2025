import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        File input = new File("input.txt");

        try(Scanner sc = new Scanner(input)){
            long sum = 0;
            while(sc.hasNextLine()){
                char[] vals = sc.next().toCharArray();
                Bank bank = new Bank();
                for(char val : vals) bank.vals.add(Integer.parseInt(Character.toString(val)));
                bank.calculateJoltageP2();
                sum += bank.joltage;
            }

            System.out.println(sum);
        }catch (FileNotFoundException ex){
            System.out.println("File input.txt was not found :(");
        }catch (Exception ex){
            System.out.println("Unexpected error occurred :/");
        }
    }
}