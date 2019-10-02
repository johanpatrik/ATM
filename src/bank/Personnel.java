package bank;

public class Personnel extends Person{
    private int salary;


    public Personnel(String personNumber, String firstName, String lastName, int salary) {
        super(personNumber, firstName, lastName);
        setSalary(salary);
    }
    public Personnel(Person person,int salary){
        super(person.getPersonNumber(),person.getFirstName(),person.getLastName());
        setSalary(salary);

    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
       if(salary<0)
           throw new IllegalArgumentException("Felaktig data");
       else
           this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "salary=" + salary;
    }

}
