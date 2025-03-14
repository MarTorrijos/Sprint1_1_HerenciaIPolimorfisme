package nivell_2_exercici_1.controller;

import nivell_2_exercici_1.model.entities.Smartphone;

public class RunMain {

    public static void run() {
        Smartphone smartphone1 = new Smartphone("Fairphone", "3");

        System.out.println(smartphone1);
        System.out.println(smartphone1.photo());
        System.out.println(smartphone1.alarm());
        System.out.println(smartphone1.call("666112233"));
    }

}
