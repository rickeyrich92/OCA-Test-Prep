package org.example.PaymentsAndTransactions;

public class Account {
    private int id;
    private Transaction[] transactions;



    public void sendMoneyToAccount(Account accountTo, double moneyAmount) {

    }

    public void withdrawMoney(double moneyAmount) {

    }

    public Transaction[] getTransactions() {

    }

    public static class Transaction {
        Account accountFrom;
        Account accountTo;
        double moneyAmount;
        StandardAccountOperations operation;


    }
}
