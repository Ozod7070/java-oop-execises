package oop3;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;

    public Account() {
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }


    public void setAnnualInterestRate(double rate) {
        this.annualInterestRate = rate;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest() {
        return balance * (getMonthlyInterestRate() / 100);
    }

    public void withdraw(double miqdor) {
        if (miqdor <= balance) {
            balance -= miqdor;
        } else {
            System.out.println("Mablag' kam!");
        }
    }

    public void deposit(double miqdor) {
        balance += miqdor;
    }
}