package oop1;

public class Main {

    static void addNumber(int a, int b){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        addNumber(6,7);
//        CMP202 cmp202 = new CMP202();
//        //cmp202.printUserDetails();
//
//        Person person = new Person();
//        person.setName("David Smith");
//
//        Person student = new Person("Bingham",
//                "Joe",
//                "1234567",
//                "BHU/04/05/0056");
//
//        Person staff = new Person("Bingham",
//                "Abu",
//                "654321",
//                667);
        //System.out.println(person.getName());
        //person.password = "1234567";

        Computer hp250 =
                new Computer(new RAM(), new Processor(), new Storage());
        System.out.println(hp250);
    }
}
