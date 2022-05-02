package com.company;

import Accounts.AccountService;
import Cards.CardService;
import Client.ClientService;
import Transactions.TransactionService;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ClientService.getClients();
        // ClientService.displayClients();

        AccountService.getAccounts();
        //AccountService.displayAccounts();

        TransactionService.getTransactions();
        // TransactionService.displayTransactions();

        CardService.getCards();
        // CardService.displayCards();

    }
}
