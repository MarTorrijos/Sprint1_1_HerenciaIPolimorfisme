package nivell_1_exercici_2.model;

public class Car {

    private final String BRAND = "Toyota";
    private String model;
    private final int POWER;

    public Car(String model, int POWER) {
        this.model = model;
        this.POWER = POWER;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public static String brake() {
        return "The vehicle is braking";
    }

    public String accelerate() {
        return "The vehicle is accelerating";
    }

    @Override
    public String toString() {
        return "Car of the brand " + this.BRAND + ", model " + this.model + " and horsepower of " + this.POWER;
    }

}