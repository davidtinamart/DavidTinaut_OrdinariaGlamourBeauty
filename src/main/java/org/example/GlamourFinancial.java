package org.example;

public interface GlamourFinancial {
    double getStockQuote(String market);
    void updateStockQuote(String market, double newQuote);
    double calculateMarketValue(double stockQuote, int totalShares);
    double calculatePriceToBookRatio(double stockQuote, double bookValue);
}