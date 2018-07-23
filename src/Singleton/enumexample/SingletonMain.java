package Singleton.enumexample;

public class SingletonMain {

    public static void main(String[] args) {

        //Not Thread safe
        ClassSingleton singletonInstance = ClassSingleton.getInstance();
        ClassSingleton singletonInstanceTwo = ClassSingleton.getInstance();

        if(singletonInstance == singletonInstanceTwo) {
            System.out.println("Same Instance ! ");
        }

        singletonInstance.setInfo("New class info");
        singletonInstanceTwo.setInfo("New class info");

        System.out.println(singletonInstance.getInfo()); //New class info
        System.out.println(singletonInstanceTwo.getInfo()); //New class info


        //thread Safe Enum approach
        EnumSingletonThreadSafe enumSingletonThreadSafe1 = EnumSingletonThreadSafe.INSTANCE.getInstance();
        EnumSingletonThreadSafe enumSingletonThreadSafe2 = EnumSingletonThreadSafe.INSTANCE.getInstance();

        System.out.println(enumSingletonThreadSafe1.getInfo()); //New class info
        System.out.println(enumSingletonThreadSafe2.getInfo()); //New class info


    }
}
