package design.patterns.singleton;

public class Singleton {
    private Singleton() {}
    private static Singleton singleton = new Singleton();

    public static Singleton getSingleton() {
        return singleton;
    }

    public void runStuff(){
        System.out.println("This is a singleton class");
    }
}
