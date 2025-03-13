package nivell_1_exercici_1.model;

public class StringInstrument extends Instrument {

    static {
        System.out.println("The class StringInstrument has been loaded");
    }

    public StringInstrument(String name, double price) {
        super(name, price);
    }

    @Override
    public String play() {
        return "A string instrument is playing";
    }

}