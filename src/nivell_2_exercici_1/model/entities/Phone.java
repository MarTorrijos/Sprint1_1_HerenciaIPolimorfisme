package nivell_2_exercici_1.model.entities;

public class Phone {

    private String brand;
    private String model;

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String call(String phoneNumber) {
        return "Calling number " + phoneNumber;
    }

    @Override
    public String toString() {
        return brand + " smartphone, model " + model;
    }

}