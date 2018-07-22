package Singleton;

public class SingletonMain {

    public static void main(String[] args) {
        ClassSingleton singletonInstance = ClassSingleton.getInstance();
        ClassSingleton singletonInstanceTwo = ClassSingleton.getInstance();

        if(singletonInstance == singletonInstanceTwo) {
            System.out.println("Same Instance ! ");
        }


    }
}
