package ds;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MyArray {

    int[] myArray= new int[5];

    static int[] anotherArray = {4, 6, 9, 3, 5};

    public static void main(String[] args) {
        for (int i = 0; i < anotherArray.length; i++){

            if (anotherArray[i] == 9){
                System.out.println("Found 9 at: "+i);
            }
            System.out.println(i +": "+anotherArray[i]);
        }

        for(int n : anotherArray){
            System.out.println(n);
        }

        MyArray array = new MyArray();
        array.addItem(45);

        List<Integer> number = new ArrayList<>();
        number.add(45);
        number.add(15);
        number.add(25);
        System.out.println(number);

        List<Integer>numbsSorted = number.stream().sorted().toList();
        System.out.println(numbsSorted);
    }

    void addItem(int number){
        myArray[0] = number;
        myArray[1] = number;
        myArray[2] = number;
    }

}
