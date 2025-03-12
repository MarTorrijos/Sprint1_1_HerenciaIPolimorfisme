package nivell_1_exercici_1;

public class Main {

    public static void main(String[] args) {
        WindInstrument windInstrumentInstrument1 = new WindInstrument("Tumpet", 839);
        WindInstrument windInstrumentInstrument2 = new WindInstrument("Flute", 599);
        System.out.println(windInstrumentInstrument1.play() + "\n" + windInstrumentInstrument2.play());

        StringInstrument stringInstrument1 = new StringInstrument("Violin", 1850);
    }

}