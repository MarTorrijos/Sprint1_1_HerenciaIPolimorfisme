package nivell_2_exercici_1;

public interface Clock {

    default String alarm() {
        return "The alarm is ringing";
    }

}