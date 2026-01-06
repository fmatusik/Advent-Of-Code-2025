package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File input = new File("input.txt");
        try(Scanner sc = new Scanner(input)){
            ArrayList<String> inputList = new ArrayList<>();

            while(sc.hasNextLine()){
                inputList.add(sc.nextLine());
            }

            Grid grid = new Grid(inputList);
            ForkliftAnalyzer analyzer = new ForkliftAnalyzer();

            int result = analyzer.countAccessible(grid);
            System.out.println(result);

        }catch (FileNotFoundException e) {
            throw new RuntimeException("Nie odnaleziono pliku");
        }catch (Exception e){
            throw new RuntimeException("Wystąpił nieoczekiwany problem");
        }
    }
}