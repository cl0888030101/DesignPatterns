package gof.builder;

import javax.print.DocFlavor;

public class Car {
    private String name;
    private String type;
    private int birthYear;
    private String manufacture;

    public Car(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public static class Builder{
        String name;
        String type;
        int birthYear;
        String manufacture;

        public Builder(String name) {
            this.name = name;
        }

        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public Builder setBirthYear(int birthYear) {
            this.birthYear = birthYear;
            return this;
        }

        public Builder setManufacture(String manufacture) {
            this.manufacture = manufacture;
            return this;
        }

        public Car build(){
            Car car = new Car(this.name);
            car.setBirthYear(this.birthYear);
            car.setManufacture(this.manufacture);
            car.setType(this.type);
            return car;
        }
    }
}
