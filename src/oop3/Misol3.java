package oop3;

public class Misol3 {
    public static void main(String[] args) {
        Account account = new Account(1122, 20000);

        account.setAnnualInterestRate(4.5);

        account.withdraw(2500);

        account.deposit(3000);

        System.out.println("Balans: " +  account.getBalance());
        System.out.println("Oylik foiz stavkasi: " + account.getMonthlyInterestRate());
        System.out.println("Oylik foiz: " + account.getMonthlyInterest());
    }

}