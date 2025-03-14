package nivell_2_exercici_1.model.entities;

import nivell_2_exercici_1.model.interfaces.Camera;
import nivell_2_exercici_1.model.interfaces.Clock;

public class Smartphone extends Phone implements Camera, Clock {

    public Smartphone(String brand, String model) {
        super(brand, model);
    }

}