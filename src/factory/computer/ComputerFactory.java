package factory.computer;

public class ComputerFactory {

    public static Computer createComputer(ComputerType computerType, String ram, String hdd, String cpu) {

        Computer comp = null;
        switch (computerType) {

            case PC:
                comp = new PC(ram, hdd, cpu);
                break;

            case SERVER:
                comp = new Server(ram, hdd, cpu);
                break;

            case SUPER_COMPUTER:
                comp = new SuperComputer(ram, hdd, cpu);
                break;

        }
        return comp;

    }
}
