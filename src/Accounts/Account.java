package Accounts;

import java.util.Calendar;
import java.util.Date;

abstract public class Account {
//class with constructor + getters + setters
    private static int nrAccounts = 0;
    protected int ID;
    protected String IBAN;
    protected double balance;
    protected Calendar createDate;
    protected Integer IdClient;


    public Account(double balance, Integer idClient)
    {
        this.ID = ++nrAccounts;
        this.IBAN = "R012" + ID;
        this.balance = balance;
        this.createDate = Calendar.getInstance();
        this.IdClient = idClient;
    }

    public static int getNrAccounts() {
        return nrAccounts;
    }

    public static void setNrAccounts(int nrAccounts) {
        Account.nrAccounts = nrAccounts;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getIBAN() {
        return IBAN;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Calendar getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Calendar createDate) {
        this.createDate = createDate;
    }

    public Integer getIdClient() {
        return IdClient;
    }

    public void setIdClient(Integer idClient) {
        IdClient = idClient;
    }
}
