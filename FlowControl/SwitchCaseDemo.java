package FlowControl;

import java.util.Scanner;
public class SwitchCaseDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();

        //Used when working with the value of a single item
        //and performing a particular action based on that value
        switch (x){
            case 3:
                System.out.println("Hello");
                break;
            case 4:
                System.out.println("World");
                break;
            default:
                System.out.println("!");
                break;
        }
    }
}
