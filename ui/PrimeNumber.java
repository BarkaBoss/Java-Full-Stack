package ui;

public class PrimeNumber {

    int count = 0;
    int primeRange(int start, int end){
        int flag;

        for (int i = start; i <= end; i++) {
            if (i == 1 || i == 0) {
                continue;
            }
            flag = 1;

            for (int j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1) {
                count++;
                System.out.println(i);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        PrimeNumber pm = new PrimeNumber();
        pm.primeRange(10, 50);
    }
}
