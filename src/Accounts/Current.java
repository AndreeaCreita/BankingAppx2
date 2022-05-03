package Accounts;

import java.text.ParseException;
import java.util.Date;

public class Current extends Account {

    public Current(double balance, Integer idClient)
    {
        super(balance, idClient);
    }
    public Current(int ID, String IBAN, double balance, String createDate, Integer idClient) throws ParseException, ParseException {
        super(ID, IBAN, balance, createDate, idClient);
    }

    public String toString() {
        return
                "Current" + '\n' +
                        "ID Account: " + ID + '\n' +
                        "IBAN: " + IBAN + '\n' +
                        "Balance: " + balance + '\n' +
                        "Created at: " + createDate.getTime() + '\n' +
                        "Client Id: " + IdClient + '\n';
    }


    public void withdraw(double amount) {
    }
}
