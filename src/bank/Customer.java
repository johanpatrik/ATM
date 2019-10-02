package bank;

import java.util.ArrayList;
import java.util.List;

public class Customer extends Person{
    private List<Account> accounts = new ArrayList<>();
    private List<Loan> loans = new ArrayList<>();

    public Customer(String personNumber, String firstName, String lastName, List<Account> accounts, List<Loan> loans) {
        super(personNumber, firstName, lastName);
        this.accounts = accounts;
        this.loans = loans;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public List<Loan> getLoans() {
        return loans;
    }

    public void setLoans(List<Loan> loans) {
        this.loans = loans;
    }

    @Override
    public String toString() {
        return super.toString() + "accounts=" + accounts + ", loans=" + loans;
    }
}
