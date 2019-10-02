package bank;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private Bank bank;
    private Rate rate;
    private List<Loan> loans = new ArrayList<>();
}
