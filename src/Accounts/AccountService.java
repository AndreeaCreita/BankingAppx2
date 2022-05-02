package Accounts;

import java.util.ArrayList;

public class AccountService {
    public static ArrayList<Account> accounts = new ArrayList<>();

    public static void getAccounts() {

    }


    public static void displayAccounts ()
    {

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

        return  null;
    }



}
