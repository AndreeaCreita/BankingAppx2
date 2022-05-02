package Accounts;

import java.util.Date;

public class Current extends Account {



    public Current(double balance, Integer idClient)
    {
        super(balance, idClient);
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


}
