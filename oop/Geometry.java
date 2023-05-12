package oop;

public class Geometry extends Maths{

    void accessingPi(){
        System.out.println(getPi());
        setPi(34f);
        System.out.println(getPi());
    }
    public float areaOfSquare(float length){
        return powTwo(length);
    }

    float areaOfTriangle(float breadth, float length){
        return divide(1,2) * multiply(breadth, length);
    }

    float areaOfRectangle(float length, float breadth){
        return multiply(length, breadth);
    }
}
