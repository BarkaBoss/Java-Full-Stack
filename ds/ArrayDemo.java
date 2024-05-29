package ds;

public class ArrayDemo {

    public static void main(String[] args) {
        int[] numbersArray = new int[5];
        numbersArray[0] = 17;
        numbersArray[1] = 34;
        numbersArray[2] = 54;
        numbersArray[3] = 77;
        numbersArray[4] = 47;

        for (int i = numbersArray.length-1; i >=0; i--){
            //System.out.println(numbersArray[i]);
            if(numbersArray[i] == 54){
                System.out.println("Found "+numbersArray[i]);
                break;
            }
        }
    }
}
