package gof.builder;

public class Computer {
    private String RAM;
    private String HDD;
    private String CPU;

    private boolean isWifiEnabled;
    private boolean isBluetoothEnabled;

    public Computer(String RAM, String HDD, String CPU) {
        this.RAM = RAM;
        this.HDD = HDD;
        this.CPU = CPU;
        this.isWifiEnabled = false;
        this.isBluetoothEnabled = false;
    }

    public void setWifiEnabled(boolean wifiEnabled) {
        isWifiEnabled = wifiEnabled;
    }

    public void setBluetoothEnabled(boolean bluetoothEnabled) {
        isBluetoothEnabled = bluetoothEnabled;
    }

    public String getRAM() {
        return RAM;
    }

    public String getHDD() {
        return HDD;
    }

    public String getCPU() {
        return CPU;
    }

    public boolean isWifiEnabled() {
        return isWifiEnabled;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    /*
    * Static builder class for storing computer parameters and contains build() function for creating computer instance
    * */
    public static class ComputerBuilder{
        private String RAM;
        private String HDD;
        private String CPU;

        private boolean isWifiEnabled;
        private boolean isBluetoothEnabled;

        public ComputerBuilder(String RAM, String HDD, String CPU) {
            this.RAM = RAM;
            this.HDD = HDD;
            this.CPU = CPU;
        }

        public ComputerBuilder setWifiEnabled(boolean wifiEnabled) {
            isWifiEnabled = wifiEnabled;
            return this;
        }

        public ComputerBuilder setBluetoothEnabled(boolean bluetoothEnabled) {
            isBluetoothEnabled = bluetoothEnabled;
            return this;
        }

        public Computer build(){
            Computer computer = new Computer(this.RAM, this.HDD, this.CPU);
            computer.setBluetoothEnabled(this.isBluetoothEnabled);
            computer.setWifiEnabled(this.isWifiEnabled);
            return computer;
        }
    }

}
