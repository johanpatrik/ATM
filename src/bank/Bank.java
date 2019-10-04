package bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {


    private List<Costumer> costumers = new ArrayList<>();
    private List<Personnel> personnel = new ArrayList<>();


    public List<Costumer> getCostumers() {
        return costumers;
    }

    public void setCostumers(List<Costumer> costumers) {
        this.costumers = costumers;
    }

    public List<Personnel> getPersonnel() {
        return personnel;
    }

    public void setPersonnel(List<Personnel> personnel) {
        this.personnel = personnel;
    }
}
