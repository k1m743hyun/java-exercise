package src;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TryWithResources {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(new File("input.txt"));
            PrintWriter printWriter = new PrintWriter(new File("output.txt"))) {
            System.out.println(scanner.nextLine());
            printWriter.println("End");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
