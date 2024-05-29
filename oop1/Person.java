package oop1;

public class Person {
    private String schoolName = "Bingham University";
    private String name;
    private String password;
    private String matricNo;
    private int staffNo;

    Person(){
        System.out.println("Object Created");
    }

    public Person(String schoolName,
                  String name,
                  String password,
                  String matricNo) {
        this.schoolName = schoolName;
        this.name = name;
        this.password = password;
        this.matricNo = matricNo;
    }

    public Person(String schoolName,
                  String name,
                  String password,
                  int staffNo) {
        this.schoolName = schoolName;
        this.name = name;
        this.password = password;
        this.staffNo = staffNo;
    }

    String getName(){
        return name;
    }

    void setName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "schoolName='" + schoolName + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", matricNo='" + matricNo + '\'' +
                ", staffNo=" + staffNo +
                '}';
    }
}
