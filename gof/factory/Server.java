package gof.factory;

public class Server extends Computer{

    public Server(String RAM, String HDD, String CPU) {
        super(RAM, HDD, CPU);
    }

    @Override
    public String getRAM() {
        return this.RAM;
    }

    @Override
    public String getHDD() {
        return this.HDD;
    }

    @Override
    public String getCPU() {
        return this.CPU;
    }
}
