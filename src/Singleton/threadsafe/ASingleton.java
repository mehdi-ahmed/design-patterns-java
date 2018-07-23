package Singleton.threadsafe;

public class ASingleton {

    //The volatile keyword marks a variable to always go to main memory,
    //for both reads and writes, in the case of multiple threads accessing it.


    private static volatile ASingleton instance;
    private static Object mutex = new Object();

    private ASingleton() {
    }

    public static ASingleton getInstance() {
        ASingleton result = instance;
        if (result == null) {
            synchronized (mutex) {
                result = instance;
                if (result == null) {
                    instance = result = new ASingleton();
                }
            }
        }

        return result;
    }
}
