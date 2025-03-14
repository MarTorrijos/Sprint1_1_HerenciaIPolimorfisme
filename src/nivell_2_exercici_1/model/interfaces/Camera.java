package nivell_2_exercici_1.model.interfaces;

public interface Camera {

    default String photo() {
        return "A photo is being taken";
    }

}