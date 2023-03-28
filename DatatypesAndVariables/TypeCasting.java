package DatatypesAndVariables;

public class TypeCasting {
    public static void main(String[] args) {
        //Implicit typecasting -> widening
        short x = 5;
        int y = x;
        System.out.println(y);

        //Explicit typecasting -> narrowing
        int v = 5;
        short w = (short) v;
        System.out.println(w);

        //Lost in precision in explicit typecasting
        int num = 50000;
        short numX = (short) num;//Short can take the current value of num
        System.out.println(numX);

        //Loss of floating point precision
        float num1 = 67.87f;
        Long num2 = (long) num1;
        System.out.println(num2);//.87 will be lost since Long only takes whole numbers
    }
}
