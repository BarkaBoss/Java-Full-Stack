package oop1;

public class LandAnimal extends Animal{

//    @Override
//    String move() {
//        return "Swings on Trees";
//    }

    public static void main(String[] args) {
        LandAnimal lion = new LandAnimal();
        LandAnimal monkey = new LandAnimal();
        monkey.move();
    }
}
