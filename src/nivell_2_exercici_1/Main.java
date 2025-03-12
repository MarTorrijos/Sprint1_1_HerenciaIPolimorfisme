package nivell_2_exercici_1;

public class Main {

    public static void main(String[] args) {
        Smartphone smartphone1 = new Smartphone("Fairphone", "3");

        System.out.println(smartphone1);
        System.out.println(smartphone1.photo());
        System.out.println(smartphone1.alarm());
        System.out.println(smartphone1.call("666112233"));

    }

}