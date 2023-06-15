package gof.builder;

public class BuilderTest {
    public static void main(String[] args) {
        Computer newComputer = new Computer.ComputerBuilder("RAM", "HDD", "CPU")
                .setBluetoothEnabled(true)
                .setWifiEnabled(true)
                .build();


        Car newCar = new Car.Builder("X5")
                .setBirthYear(2020)
                .setManufacture("BMW")
                .setType("SUV")
                .build();

    }
}