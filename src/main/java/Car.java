public class Car extends Vehicle {

    private int numberOfDoors;
    private int numberOfWheels;


    public Car(String model, int yearOfManufacture, String manufacturer, int numberOfDoors, int numberOfWheels) {
        super(model, yearOfManufacture, manufacturer);
        this.numberOfDoors = numberOfDoors;
        this.numberOfWheels = numberOfWheels;
        //System.out.println("test.....");
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + getManufacturer() + '\'' +
                ", model='" + getModel() + '\'' +
                ", yearOfManufacture=" + getYearOfManufacture() +
                ", numberOfDoors=" + numberOfDoors +
                ", numberOfWheels=" + numberOfWheels +
                '}';
    }
}
