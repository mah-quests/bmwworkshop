package za.co.bmw.workshop.kyalami.racetrack.client;

public class OtherCarsVice {
    public static OtherCarsVice EMPTY_CAR = new OtherCarsVice();

    private String brand;

    private String model;

    private String engineCapacity;

    private int year;

    private int torque;

    private double zeroToHundred;

    private int topSpeed;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(String engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getTorque() {
        return torque;
    }

    public void setTorque(int torque) {
        this.torque = torque;
    }

    public double getZeroToHundred() {
        return zeroToHundred;
    }

    public void setZeroToHundred(double zeroToHundred) {
        this.zeroToHundred = zeroToHundred;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }
}
