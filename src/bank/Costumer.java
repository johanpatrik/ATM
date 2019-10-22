package bank;

import java.util.ArrayList;
import java.util.List;

public class Costumer extends Person {

    private List<Account> accounts = new ArrayList<>();
    private List<Loan> loans = new ArrayList<>();

    public Costumer(String personNumber, String firstName, String lastName, Account account,
        Loan loan) {
        super(personNumber, firstName, lastName);
        setAccounts(account);
//        setLoans(loan);

    }

    public Costumer(String personNumber, String firstName, String lastName) {
        super(personNumber, firstName, lastName);
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(Account account) {
        accounts.add(account);
    }

//    public List<Loan> getLoans() {
//        return loans;
//    }
//
//    public void setLoans(Loan loan) {
//        loans.add(loan);
//    }

    @Override
    public String toString() {
        return super.toString() + "accounts=" + accounts; // + "loans=" + loans;
    }
}
