package factory.computer;

public class ComputerFactoryMain {

    Computer pc = ComputerFactory.createComputer(ComputerType.PC, "1GB", "500GB", "i7");
    Computer server = ComputerFactory.createComputer(ComputerType.SERVER, "5GB", "5TB", "amd Rayzen");
    Computer superComputer = ComputerFactory.createComputer(ComputerType.SUPER_COMPUTER, "5GB", "5TB", "amd Rayzen");
}
