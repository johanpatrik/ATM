package bank;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        List<Account> accounts =  new ArrayList<>();
        List<Loan> loans =  new ArrayList<>();

        Customer customer = new Customer("951921923","Kalle","Larsson",accounts,loans);
        bank.getCustomers().add(customer);
        System.out.println(bank.getCustomers());
        
        Personnel personnel = new Personnel("95192591","Frida","Svensson",25000);

        bank.getPersonnel().add(personnel);
        System.out.println(bank.getPersonnel());
        System.out.println("Johan Özbek");
        System.out.println("Johannes va här");


    }
}
