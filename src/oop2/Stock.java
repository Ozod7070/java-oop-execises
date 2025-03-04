package oop2;

public class Stock {
    String symbol;
    String name;
    double previosClosingPrice;
    double currentPrice;

    Stock(String symbol, String name, double previosClosingPrice,double currentPrice){
        this.symbol = symbol;
        this.name = name;
        this.previosClosingPrice = previosClosingPrice;
        this.currentPrice = currentPrice;
    }
    double getChangePercent(){
        return (currentPrice / previosClosingPrice - 1) * 100;
    }



}
