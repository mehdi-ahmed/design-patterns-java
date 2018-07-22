package Singleton;


/**
 * Classic approach :
 * A private constructor
 * A static field containing its only instance
 * A static factory method for obtaining the instance
 */
public class ClassSingleton {


    private static ClassSingleton INSTANCE;
    private String info = "Initial info class";

    private ClassSingleton() {

    }

    public static ClassSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ClassSingleton();
        }
        return INSTANCE;
    }

    //Getters and Setters


}
