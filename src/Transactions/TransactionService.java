package Transactions;

import java.util.ArrayList;

public class TransactionService {

    public static ArrayList<Transaction> transactions = new ArrayList<>();

    public static void getTransactions() {
    }

    public static void displayTransactions ()
    {

    }

    public static Transaction getTransactionById(int id)
    {

        return null;
    }

    public static ArrayList<Integer> getTransactionsByIdAccount(int id)
    {
        ArrayList<Integer> accountTransactions = new ArrayList<>();

        for ( Transaction transaction : transactions)
        {

            if (transaction.getSourceAccount() == id){
                accountTransactions.add(transaction.getID());
            }
        }
        return accountTransactions;
    }
}
