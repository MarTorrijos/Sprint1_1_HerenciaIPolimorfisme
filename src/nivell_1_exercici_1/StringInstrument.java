package nivell_1_exercici_1;

public class StringInstrument extends Instrument {

    static {
        System.out.println("The class String_instrument has been loaded");
    }

    public StringInstrument(String name, double price) {
        super(name, price);
    }

    @Override
    public String play() {
        return "A string instrument is playing";
    }

}