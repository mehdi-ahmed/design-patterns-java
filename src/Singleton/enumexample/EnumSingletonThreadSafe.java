package Singleton.enumexample;

public enum EnumSingletonThreadSafe {

    INSTANCE("Initial info class ENUM");

    private String info;

    EnumSingletonThreadSafe(String info) {
        this.info = info;
    }

    public EnumSingletonThreadSafe getInstance() {
        return INSTANCE;
    }

    //getters and setters

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
