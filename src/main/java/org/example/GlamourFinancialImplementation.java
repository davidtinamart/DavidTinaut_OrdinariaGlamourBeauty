package org.example;
import java.util.HashMap;
import java.util.Map;


public class GlamourFinancialImplementation implements GlamourFinancial {
    private Map<String, Double> stockQuotes; // Mapa para mantener las cotizaciones en diferentes mercados

    public GlamourFinancialImplementation() {
        stockQuotes = new HashMap<>();
    }

    @Override
    public double getStockQuote(String market) {
        return stockQuotes.getOrDefault(market, 0.0);
    }

    @Override
    public void updateStockQuote(String market, double newQuote) {
        stockQuotes.put(market, newQuote);
    }

    @Override
    public double calculateMarketValue(double stockQuote, int totalShares) {
        return stockQuote * totalShares;
    }

    @Override
    public double calculatePriceToBookRatio(double stockQuote, double bookValue) {
        if (bookValue == 0) {
            return 0.0; // Evitar división por cero
        }
        return stockQuote / bookValue;
    }
}