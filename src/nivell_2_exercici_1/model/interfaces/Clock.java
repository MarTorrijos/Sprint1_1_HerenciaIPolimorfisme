package nivell_2_exercici_1.model.interfaces;

public interface Clock {

    default String alarm() {
        return "The alarm is ringing";
    }

}