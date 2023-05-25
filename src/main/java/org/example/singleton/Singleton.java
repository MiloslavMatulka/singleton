package org.example.singleton;

public class Singleton {

    private static final Singleton singleton = new Singleton();

    // Prevents any other class from instantiating
    private Singleton() {}

    public static Singleton getInstance() {
        return singleton;
    }

    /*
    private static Singleton singleton = null;

    private Singleton() {}

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
    */

}
