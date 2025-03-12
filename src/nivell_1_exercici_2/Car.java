package nivell_1_exercici_2;

public class Car {

    static final String BRAND = "Toyota";
    static String model;
    private final int POWER = 1000;

    public Car(String model) {
        this.model = model;
    }

    public String getBrand() {
        return BRAND;
    }
    public String getModel() {
        return model;
    }
    public int getPOWER() {
        return POWER;
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
        return "Car of the brand " + BRAND + ", model " + model + " and horsepower of " + POWER;
    }



}