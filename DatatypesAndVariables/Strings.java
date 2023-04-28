package DatatypesAndVariables;

import java.util.Scanner;


public class Strings {
    public static void main(String[] args) {
        String str = "Hello \u00BB World";
        char ngn = '\u20A6';
        System.out.println(str);

        int num1 = 10;
        String num2 = "20";

        System.out.println(num1 + num2+ ngn);
    }
}
