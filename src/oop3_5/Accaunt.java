package oop3_5;

public class Accaunt {
    private int id;
    private Customer customer;
    private double balance = 0;

    public Accaunt(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Accaunt(int id, Customer customer) {
        this(id, customer,0);
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName(){
        return customer.getName();
    }

    public Accaunt deposit(double amount){
        this.balance += amount;
        return this;
    }

    public Accaunt withdraw(double amount) {
        if (balance >= amount) {
            this.balance -= amount;
        } else {
            System.out.println("Mablag'ingiz yetarli emas");
        }
        return this;
    }
    @Override
    public String toString() {
        return String.format("Account[id=%d, customer=%s, balance=%.2f]", id, customer, balance);
    }


}

