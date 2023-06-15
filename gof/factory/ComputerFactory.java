package gof.factory;

/*
* Factory class: create different instance based on type, all the instance should have the same parent class
* */
public class ComputerFactory {
    public static final String COMPUTER_TYPE_PC = "PC";
    public static final String COMPUTER_TYPE_SERVER = "SERVER";

    public static Computer getComputer(String type, String HDD, String RAM, String CPU){
        switch (type){
            case COMPUTER_TYPE_PC -> {
                return new PC(RAM, HDD, CPU);
            }
            case COMPUTER_TYPE_SERVER -> {
                return new Server(RAM, HDD, CPU);
            }
            default -> {
                return null;
            }
        }
    }
}
