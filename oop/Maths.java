package oop;

public class Maths {

    private float pi = 22/7f;

    public float getPi() {
        return pi;
    }

    public void setPi(float pi) {
        this.pi = pi;
    }

    float multiply(float numberOne, float numberTwo){
        return numberOne * numberTwo;
    }

    float divide(float numberOne, float numberTwo){
        return numberOne / numberTwo;
    }

    float powTwo(float number){
        return number * number;
    }
}
