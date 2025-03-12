package nivell_3_exercici_1;

public class Editor {

    private String name;
    private final String DNI;
    private int salary = 1500;

    public Editor(String name, String DNI) {
        this.name = name;
        this.DNI = DNI;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDNI() {
        return DNI;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void raiseSalary(int salaryIncrement) {
        salary = salary + salaryIncrement;
    }

    @Override
    public String toString() {
        return name + " - " + DNI;
    }
}
