package Accounts;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;

abstract public class Account {

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

    public Account(int ID, String IBAN, double balance, String  createDate, Integer idClient) throws ParseException {
        this.ID = ID;
        nrAccounts ++;
        this.IBAN = IBAN;
        this.balance = balance;

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        Date date = sdf.parse(createDate);
        this.createDate = sdf.getCalendar();
        this.IdClient = idClient;
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


    @Override
    public String toString() {
        return "Account" + '\n' +
                "ID" + ID + '\n' +
                "IBAN: " + IBAN + '\n' +
                "Balance: " + balance + '\n' +
                "Create Date: " + createDate.getTime() +
                "Client Id: " + IdClient + '\n';
    }

    @Override
    public boolean equals(Object o) {
       if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return ID == account.ID && Double.compare(account.balance, balance) == 0 && Objects.equals(IBAN, account.IBAN) && Objects.equals(createDate, account.createDate) && Objects.equals(IdClient, account.IdClient) ;
   }

    @Override
    public int hashCode() {
        return Objects.hash(ID, IBAN, balance, createDate, IdClient);
    }





}