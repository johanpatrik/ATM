package bank;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();



        Costumer costumer = new Costumer("951921923","Kalle","Larsson");
        bank.getCostumers().add(costumer);
        System.out.println(bank.getCostumers());


        Personnel personnel = new Personnel("95192591","Frida","Svensson",25000);

        bank.getPersonnel().add(personnel);
        System.out.println(bank.getPersonnel());
        System.out.println("Johan Özbek");
        System.out.println("Johannes va här");


    }
}
