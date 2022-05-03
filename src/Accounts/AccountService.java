package Accounts;

import java.util.ArrayList;

public class AccountService {
    public static ArrayList<Account> accounts = new ArrayList<>();



    public static void displayAccounts ()
    {

        System.out.println("List of accounts: \n");
        for ( Account account : accounts)
        {
            System.out.println(account.toString());
        }
    }


    public static Account getAccountByClientId (Integer id)
    {
        for ( Account account : accounts)
        {
            if ( account.getIdClient().equals(id) ) {
                return account;
            }
        }
        return null;
    }
    public static Account getAccountById (int id)
    {
        for ( Account account : accounts)
        {
            if ( account.getID() == id) {
                return account;
            }
        }
        return  null;
    }
    public static Account getAccountByIban(String IBAN)
    {
        for ( Account account : accounts)
        {
            if ( account.getIBAN().equals(IBAN)) {
                return account;
            }
        }
        return  null;
    }






}
