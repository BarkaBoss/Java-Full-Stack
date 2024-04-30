package oop1;

public class CMP202 {
    int age;
    float height;
    String name;
    String password;

    void printUserDetails(){
        age = 23;
        height = 170;
        name = "James";
        name.length();

        password = "123456";
        if (password.contains("123456") || password.contains("abcef")){
            System.out.println("Password is too easy");
        }
    }
}
