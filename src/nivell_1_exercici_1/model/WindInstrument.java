package nivell_1_exercici_1.model;

public class WindInstrument extends Instrument {

    static {
        System.out.println("The class WindInstrument has been loaded");
    }

    public WindInstrument(String name, double price) {
        super(name, price);
    }

    @Override
    public String play() {
        return "A wind instrument is playing";
    }

}