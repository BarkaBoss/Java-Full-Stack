package design.patterns.singleton;

public class SingletonMain {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();
        singleton.runStuff();
    }
}
