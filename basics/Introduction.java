package basics;

import java.util.Scanner;

public class Introduction {

    public static void main(String[] args) {
        //Class     objectName = new Class();
        Scanner input = new Scanner(System.in);
        Introduction intro = new Introduction();

        System.out.println("Enter the end number");
        //int end = input.nextInt();

        System.out.println("Enter the Prime number");
        int prime = input.nextInt();
        if (intro.checkPrimeNumber(prime)){
            System.out.println(prime+" is Prime");
        }else {
            System.out.println(prime+" is not Prime");
        }
        //intro.getOddNumbers(end);
    }

    void getOddNumbers(int end){
        for (int i = 0; i <= end; i++) {
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
    }

    boolean checkPrimeNumber(int number){
        boolean flag = true;

        for (int i = 2; i < number; i++) {
            if (number % i == 0){
                flag = false;
            }
        }
        return flag;
    }
}
