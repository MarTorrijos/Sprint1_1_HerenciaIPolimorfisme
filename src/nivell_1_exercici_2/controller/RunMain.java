package nivell_1_exercici_2.controller;

import nivell_1_exercici_2.model.Car;

public class RunMain {

    public static void run() {
        Car car1 = new Car("Prius", 100);

        System.out.println(car1);
        System.out.println(Car.brake());
        System.out.println(car1.accelerate());
    }

}
