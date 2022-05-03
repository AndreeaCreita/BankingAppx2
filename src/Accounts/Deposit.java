package Accounts;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

public class Deposit extends Account {

    private int period;
    private double gain;

    public Deposit(double balance, Integer idClient, int period)
    {
        super(balance, idClient);
        this.period = period;
        this.gain = 0.2 * period;
    }

    public Deposit(int ID, String IBAN, double balance, Integer idClient, String createDate, int period, double gain) throws ParseException, ParseException {
        super(ID, IBAN, balance, createDate, idClient);
        this.period = period;
        this.gain = gain;
    }
    @Override
    public double getBalance() {
        Calendar currentDate = Calendar.getInstance();
        if(currentDate.compareTo(createDate)%3 == 0)
        {
            setBalance(balance * gain);
        }
        return balance;
    }

    @Override
    public void setBalance(double balance) {
        this.balance = balance;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Deposit deposit = (Deposit) o;
        return period == deposit.period;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), period);
    }




}