package bank;

public class Rate {

    private double rate;
    private Personnel personnel;

    public Rate(double rate, Personnel personnel) {
        setRate(rate);
        setPersonnel(personnel);
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        if (rate < 0) {
            throw new IllegalArgumentException("Felaktig data");
        } else {
            this.rate = rate;
        }
    }

    public Personnel getPersonnel() {
        return personnel;
    }

    public void setPersonnel(Personnel personnel) {
        if (personnel == null) {
            throw new NullPointerException();
        } else {
            this.personnel = personnel;
        }
    }
}
