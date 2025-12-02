import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        File inputFile = new File("input.txt");
        Roller roller = new Roller();
        int countOfZeros = 0;
        try(Scanner sc = new Scanner(inputFile)) {
            while(sc.hasNextLine()) {
                String movement = sc.nextLine();
                char direction = movement.charAt(0);
                int moveValue = Integer.parseInt(movement.substring(1));
                roller.changeRollerValue(direction, moveValue);
                if (roller.value == 0) countOfZeros++;
                System.out.println(roller.value + " " + direction + " " + moveValue);
            }
            System.out.println(countOfZeros);
        } catch (FileNotFoundException e){
            System.out.println("File input.txt was not found :(");
        }
        catch (Exception e){
            System.out.println("Not excepted error occurred :(");
        }

        //part 2

        /* File inputFile = new File("input.txt");
        Roller roller = new Roller();
        int countOfZeros = 0;
        try(Scanner sc = new Scanner(inputFile)) {
            while(sc.hasNextLine()) {
                String movement = sc.nextLine();
                char direction = movement.charAt(0);
                int moveValue = Integer.parseInt(movement.substring(1));
                countOfZeros += roller.howManyTimesRollerGoesThroughZero(direction, moveValue);
                roller.changeRollerValue(direction, moveValue);
                System.out.println(roller.value + " " + direction + " " + moveValue);
            }
            System.out.println(countOfZeros);
        } catch (FileNotFoundException e){
            System.out.println("File input.txt was not found :(");
        }
        catch (Exception e){
            System.out.println("Not excepted error occurred :(");
        }*/
    }
}