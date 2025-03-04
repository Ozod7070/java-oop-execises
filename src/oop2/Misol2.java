package oop2;

public class Misol2 {
    public static void main(String[] args) {
        Stock stock = new Stock("ORCL","Oracle Corporation",34.5,34.35);
        double percentage = stock.getChangePercent();
        System.out.println("Javob: "+percentage);
    }
}