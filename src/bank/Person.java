package bank;

public class Person {
    private String personNumber;
    private String firstName;
    private String lastName;

    public Person(String personNumber, String firstName, String lastName) {
      setPersonNumber(personNumber);
      setFirstName(firstName);
      setLastName(lastName);
    }


    public String getPersonNumber() {
        return personNumber;
    }

    public void setPersonNumber(String personNumber) {
      if(personNumber.isEmpty()|| personNumber==null)
          throw new NullPointerException();
      else
          this.personNumber=personNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
      if(firstName.isEmpty()||firstName==null)
          throw new NullPointerException();
      else
          this.firstName=firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(lastName.isEmpty()||lastName==null)
            throw new NullPointerException();
        else
            this.lastName=lastName;
    }
    @Override
    public String toString() {
        return getFirstName()+" "+getLastName()+" "+getPersonNumber();

    }
}
