package nivell_1_exercici_2;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car("Prius");

        System.out.println(car1);
        System.out.println(Car.brake());
        System.out.println(car1.accelerate());  
    }

}