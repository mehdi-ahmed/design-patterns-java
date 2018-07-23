package Singleton.otherexamples;

public class LazySingleton {

    private static LazySingleton INSTANCE = null;

    //Every time the INSTANCE_VOLATILE is changed, all the threads are notified.(current version if Java)
    private static volatile LazySingleton INSTANCE_VOLATILE = null;

    private LazySingleton() {
    }

    //This method is not threadsafe
    public static LazySingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LazySingleton();
        }
        return INSTANCE;
    }

    //added synchronized...but there is a performance issue here with synchronized
    public static synchronized LazySingleton getInstanceSynchronized() {
        if (INSTANCE == null) {
            INSTANCE = new LazySingleton();
        }
        return INSTANCE;
    }

    //added synchronized...and Fast. We have to mark instance variable with Volatile
    public static synchronized LazySingleton getInstanceSynchronizedFast() {
        //First check
        if (INSTANCE_VOLATILE == null) {
            synchronized (LazySingleton.class) {
                if (INSTANCE_VOLATILE == null) {
                    INSTANCE_VOLATILE = new LazySingleton();
                }
            }
        }
        return INSTANCE_VOLATILE;
    }
}
