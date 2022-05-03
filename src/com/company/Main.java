package com.company;

import Accounts.AccountService;
import Cards.CardService;
import Client.ClientService;
import Transactions.TransactionService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //ClientService.getClients();
        // ClientService.displayClients();

       // AccountService.getAccounts();
        //AccountService.displayAccounts();

        //TransactionService.getTransactions();
        // TransactionService.displayTransactions();

        //CardService.getCards();
        // CardService.displayCards();

        while (true) {
            System.out.println("MENU");
            System.out.println("1.Enter your card");
            System.out.println("2.Transfer money");
            System.out.println("3.Get account statement");
            System.out.println("4.Admin");
            System.out.println("5.Exit\n");
            System.out.println("Choose an option:");

            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();
            if (option == 1) {
                //option1(scanner);
            }
            else if (option == 2) {
                //option2(scanner);
            }
            else if (option == 3) {
                //option3(scanner);
            }
            else if (option == 4) {
                //option4(scanner);
            } else break;
        }
    }

    }


