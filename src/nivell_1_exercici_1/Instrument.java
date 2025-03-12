package nivell_1_exercici_1;

public abstract class Instrument {

    private String name;
    private double price;

    public Instrument(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public abstract String play();

}