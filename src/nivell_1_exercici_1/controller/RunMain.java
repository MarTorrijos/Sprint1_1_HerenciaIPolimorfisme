package nivell_1_exercici_1.controller;

import nivell_1_exercici_1.model.PercussionInstrument;
import nivell_1_exercici_1.model.StringInstrument;
import nivell_1_exercici_1.model.WindInstrument;

public class RunMain {

    public static void  run() {
        WindInstrument windInstrument1 = new WindInstrument("Trumpet", 839);
        StringInstrument stringInstrument1 = new StringInstrument("Harp", 2400);
        PercussionInstrument percussionInstrument1 = new PercussionInstrument("Drum kit", 1200);

        System.out.println(windInstrument1.play());
        System.out.println(stringInstrument1.play());
        System.out.println(percussionInstrument1.play());

        System.out.println(windInstrument1);
        System.out.println(stringInstrument1);
        System.out.println(percussionInstrument1);
    }

}