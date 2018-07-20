package builder.computer;

public class Computer {

    //required params
    private String ram;
    private String hdd;
    private String cpu;

    //optional params
    private boolean isGraphicCardEnabled;
    private boolean isBlueToothEnabled;


    private Computer(Builder builder) {
        this.hdd = builder.hdd;
        this.ram = builder.ram;
        this.cpu = builder.cpu;
        this.isBlueToothEnabled = builder.isBlueToothEnabled;
        this.isGraphicCardEnabled = builder.isGraphicCardEnabled;
    }

    public String getRam() {
        return ram;
    }

    public String getHdd() {
        return hdd;
    }

    public String getCpu() {
        return cpu;
    }

    public boolean isGraphicCardEnabled() {
        return isGraphicCardEnabled;
    }

    public boolean isBlueToothEnabled() {
        return isBlueToothEnabled;
    }

    public static class Builder {

        //required params
        private String ram;
        private String hdd;
        private String cpu;

        //optional params
        private boolean isGraphicCardEnabled;
        private boolean isBlueToothEnabled;

        public Builder(String ram, String hdd, String cpu) {
            this.ram = ram;
            this.hdd = hdd;
            this.cpu = cpu;
        }

        public Builder withGraphicCardEnabled(boolean graphicCardEnabled) {
            this.isGraphicCardEnabled = graphicCardEnabled;
            return this;
        }

        public Builder withBlueToothEnabled(boolean blueToothEnabled) {
            this.isBlueToothEnabled = blueToothEnabled;
            return this;
        }

        public Computer Build() {
            return new Computer(this);
        }
    }

    @Override
    public String toString() {
        return "Computer{" +
                "ram='" + ram + '\'' +
                ", hdd='" + hdd + '\'' +
                ", cpu='" + cpu + '\'' +
                ", isGraphicCardEnabled=" + isGraphicCardEnabled +
                ", isBlueToothEnabled=" + isBlueToothEnabled +
                '}';
    }
}
