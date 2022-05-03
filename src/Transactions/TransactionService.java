package Transactions;

import java.util.ArrayList;

public class TransactionService {

    public static ArrayList<Transaction> transactions = new ArrayList<>();

    public static void displayTransactions ()
    {
        System.out.println("List of transactions: \n");
        for ( Transaction transaction : transactions)
        {
            System.out.println(transaction.toString());
        }
    }

    public static Transaction getTransactionById(int id)
    {
        for ( Transaction transaction : transactions)
        {
            if ( transaction.getID() == id) {
                return transaction;
            }
        }
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

    public static ArrayList<Transaction> addTransaction (Transaction transaction) {

        transactions.add(transaction);

        return transactions;
    }


    public static void deleteTransaction (Transaction transaction)  {

        transactions.remove(transaction);

    }
}
