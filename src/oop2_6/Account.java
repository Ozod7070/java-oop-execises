package oop2_6;

public class Account {
    private String id;
    private String name;
    private int balance;

    Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount) {
        return balance += amount;
    }

    public Account debit(int amount) {
        if (amount <= balance) {
            this.balance -= amount;
        } else {
            System.err.println("Mablag' yetarli emas");
        }
        return this;
    }
    public Account transferTo(Account another, int amount) {
        if (amount <= balance) {
            this.balance -= amount;
            another.balance += amount;
        } else {
            System.err.println("Mablag' yetarli emas");
        }
        return this;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}

