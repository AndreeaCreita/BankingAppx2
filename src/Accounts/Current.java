package Accounts;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

public class Current extends Account {

    public Current(int ID, String IBAN, double balance, Calendar createDate, Integer idClient) {
        super(ID, IBAN, balance, createDate, idClient);
    }


    @Override
    public String toString() {
        return "Current{" +
                "ID=" + ID +
                ", IBAN='" + IBAN + '\'' +
                ", balance=" + balance +
                ", createDate=" + createDate +
                ", IdClient=" + IdClient +
                '}';
    }

    public void withdraw(double amount) {
    }
}
