package string;

import java.util.Scanner;

public class StringDemo {

    public static void main(String[] args) {
        StringDemo demo = new StringDemo();
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        demo.reverseString(str);
        String repStr = str.replace("c", "v");
        System.out.println(repStr);
    }


    String reverseString(String string){
        String str = string;
        System.out.println(str.codePointCount(1, 4));
        StringBuilder rev = new StringBuilder();

        for (int i = str.length() - 1 ; i  >= 0 ; i--) {
            rev.append(str.charAt(i));
        }
        System.out.println(rev);

        return rev.toString();
    }
}
