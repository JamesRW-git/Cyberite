package util;

import java.util.Scanner;

public class Input {
    private static final Scanner scanner = new Scanner(System.in);

    public static String getString(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }



}
