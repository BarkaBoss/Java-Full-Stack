package design.patterns.singleton;

public class SingletonMain {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();
        Singleton ingleton = Singleton.getSingleton();
        System.out.println(singleton);
        System.out.println(ingleton);
//        ingleton.runStuff();
//        singleton.runStuff();
    }
}
