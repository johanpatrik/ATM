package bank;

public class Personnel extends Person{
    private int salary;


    public Personnel(String personNumber, String firstName, String lastName, int salary) {
        super(personNumber, firstName, lastName);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "salary=" + salary;
    }
}
