package nivell_1_exercici_1;

public class PercussionInstrument extends Instrument {

    static {
        System.out.println("The class Percussion has been loaded");
    }

    public PercussionInstrument(String name, double price) {
        super(name, price);
    }

    @Override
    public String play() {
        return "A percussion instrument is playing";
    }

}