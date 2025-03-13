package nivell_1_exercici_1.model;

public abstract class Instrument {

    private String name;
    private double price;

    public Instrument(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public abstract String play();

    @Override
    public String toString() {
        return "A " + this.name + " with a price of " + this.price;
    }

}