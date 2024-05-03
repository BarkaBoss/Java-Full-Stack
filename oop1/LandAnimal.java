package oop1;

public class LandAnimal extends Animal{

    @Override
    String move() {
        return "Swings on Trees";
    }

    public static void main(String[] args) {
        Animal chimp = new LandAnimal();
        LandAnimal monkey = new LandAnimal();
        monkey.name = "Monkey";
        chimp.name = "Champa";
        System.out.println(monkey.name+" "+monkey.move());
        System.out.println(chimp.name+" "+monkey.move());
    }
}
