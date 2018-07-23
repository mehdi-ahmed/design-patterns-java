package Singleton.otherexamples;

public class EagerSingleton {

    //This is thread safe because of static instantiation
    //Eager because there is an instantiation here directly after declaring
    public static EagerSingleton instance = new EagerSingleton();


    //private constructor
    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}
