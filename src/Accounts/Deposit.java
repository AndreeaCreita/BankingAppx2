package Accounts;

import java.util.Date;

public class Deposit extends Account {

    private int period;
    private double gain;

    public Deposit(double balance, Integer idClient, int period)
    {
        super(balance, idClient);
        this.period = period;
        this.gain = 0.2 * period;
    }


    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public double getGain() {
        return gain;
    }

    public void setGain(double gain) {
        this.gain = gain;
    }

    @Override
    public String toString() {
        return  "Deposit" + '\n' +
                "ID Account" + ID + '\n' +
                "IBAN: " + IBAN + '\n' +
                "Balance = " + balance + '\n' +
                "Created at: " + createDate.getTime() + '\n' +
                "Period: " + period + " months\n" +
                "Gain: " + gain + '\n' +
                "Client Id: " + IdClient + '\n';
    }



}