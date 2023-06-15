package gof.factory;

/*
*
*
* */
public abstract class Computer {

    protected String RAM;
    protected String HDD;
    protected String CPU;

    public Computer(String RAM, String HDD, String CPU) {
        this.RAM = RAM;
        this.HDD = HDD;
        this.CPU = CPU;
    }

    public abstract String getRAM();
    public abstract String getHDD();
    public abstract String getCPU();

    public String toString(){
        return "RAM: " + this.RAM + ", HDD: " + this.HDD + ", CPU: " + this.CPU;
    }
}
