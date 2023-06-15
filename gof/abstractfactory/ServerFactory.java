package gof.abstractfactory;

import gof.factory.Computer;
import gof.factory.Server;

public class ServerFactory implements ComputerAbstractFactory{

    private final String RAM;
    private final String HDD;
    private final String CPU;

    public ServerFactory(String RAM, String HDD, String CPU) {
        this.RAM = RAM;
        this.HDD = HDD;
        this.CPU = CPU;
    }
    @Override
    public Computer createComputer() {
        return new Server(RAM, HDD, CPU);
    }
}
