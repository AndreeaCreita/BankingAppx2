package Transactions;

import Accounts.Account;

import java.util.Calendar;
import java.util.Date;

public class Transaction {
    protected static int nrTransactions = 0;
    protected int ID;
    protected Calendar date;
    protected Integer sourceAccount;
    protected double sold;

    public Transaction(int ID, Calendar date, Integer sourceAccount, double sold) {
        this.ID = ID;
        this.date = date;
        this.sourceAccount = sourceAccount;
        this.sold = sold;
    }

    public static int getNrTransactions() {
        return nrTransactions;
    }

    public static void setNrTransactions(int nrTransactions) {
        Transaction.nrTransactions = nrTransactions;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public Integer getSourceAccount() {
        return sourceAccount;
    }

    public void setSourceAccount(Integer sourceAccount) {
        this.sourceAccount = sourceAccount;
    }

    public double getSold() {
        return sold;
    }

    public void setSold(double sold) {
        this.sold = sold;
    }
}
