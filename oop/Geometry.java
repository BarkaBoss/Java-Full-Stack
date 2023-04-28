package oop;

public class Geometry extends Maths{

    float areaOfSquare(float length){
        return powTwo(length);
    }

    float areaOfTriangle(float breadth, float length){
        return divide(1,2) * multiply(breadth, length);
    }

    float areaOfRectangle(float length, float breadth){
        return multiply(length, breadth);
    }
}
