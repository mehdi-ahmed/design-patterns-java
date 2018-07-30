package Singleton.enumexample;


/**
 * Classic approach :
 * A private constructor
 * A static field containing its only instance
 * A static factory methodfactory for obtaining the instance
 */


public class ClassSingleton {

    private static ClassSingleton INSTANCE = null;
    private String info = "Initial info class classic approach";

    private ClassSingleton() {
    }

    public static ClassSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ClassSingleton();
        }
        return INSTANCE;
    }

    //Getters and Setters

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
