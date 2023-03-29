package src;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TryWithResources {

    public static void main(String[] args) {

        try (CustomResource customResource = new CustomResource()) {
            customResource.printMessage();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
