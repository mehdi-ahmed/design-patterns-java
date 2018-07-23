package Singleton.otherexamples;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class OtherExamplesMain {

    public static void main(String[] args) throws NoSuchMethodException,
            IllegalAccessException, InvocationTargetException, InstantiationException {


        //Eager Singleton example
        EagerSingleton singleton1 = EagerSingleton.getInstance();
        EagerSingleton singleton2 = EagerSingleton.getInstance();

        System.out.println(singleton1 == singleton2); // true

        //Lazy Singleton example
        LazySingleton singleton3 = LazySingleton.getInstance();
        LazySingleton singleton4 = LazySingleton.getInstanceSynchronized();

        System.out.println(singleton3 == singleton4); // true

        Constructor constructor = EagerSingleton.class.getDeclaredConstructor(new Class[0]);
        constructor.setAccessible(true);

        EagerSingleton eagerSingleton3 = (EagerSingleton) constructor.newInstance();

        System.out.println(singleton1 == eagerSingleton3); // false

    }
}
