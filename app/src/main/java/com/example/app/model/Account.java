package com.example.app.model;

public class Account {
    private long id;
    private String accountNumber;
    private double balance;

    public Account(long id, String accountNumber, double balance) {
        super();
        this.id = id;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public Account() {
        super();
        // TODO Auto-generated constructor stub
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account [id=" + id + ", accountNumber=" + accountNumber + ", balance=" + balance + "]";
    }
}
