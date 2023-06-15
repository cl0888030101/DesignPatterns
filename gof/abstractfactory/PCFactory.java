package gof.abstractfactory;

import gof.factory.Computer;
import gof.factory.PC;

public class PCFactory implements ComputerAbstractFactory{

    private final String RAM;
    private final String HDD;
    private final String CPU;

    public PCFactory(String RAM, String HDD, String CPU) {
        this.RAM = RAM;
        this.HDD = HDD;
        this.CPU = CPU;
    }

    @Override
    public Computer createComputer() {
        return new PC(RAM, HDD, CPU);
    }
}
