package datastructures;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(10);
        stack.push(45);
        stack.push(5);
        stack.push(15);
        stack.push(35);
        stack.pop();
        stack.pop();
        stack.pop();
    }
}
