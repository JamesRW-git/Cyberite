package util;

import static util.Input.*;

public class InputTest {
    public static void main(String[] args) {
        System.out.println(getString("Enter a string"));
        System.out.println(yesNo("Do you like cookies?"));
        System.out.println(getInt(1, 100));
        System.out.println(getInt("Enter a number"));
        System.out.println(getDouble(1, 100));
        System.out.println(getDouble("Enter a decimal number"));
    }
}
