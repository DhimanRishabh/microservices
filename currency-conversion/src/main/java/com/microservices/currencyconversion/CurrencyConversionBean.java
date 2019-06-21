package com.microservices.currencyconversion;

public class CurrencyConversionBean {
    int id;
    String from;
    String to;
    double calculatedAmount;
    int port;
    int quantity;
    int exchangeRate;

    public CurrencyConversionBean() {
    }

    public CurrencyConversionBean(int id, String from, String to, double calculatedAmount, int port, int quantity, int exchangeRate) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.calculatedAmount = calculatedAmount;
        this.port = port;
        this.quantity = quantity;
        this.exchangeRate = exchangeRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public double getCalculatedAmount() {
        return calculatedAmount;
    }

    public void setCalculatedAmount(double calculatedAmount) {
        this.calculatedAmount = calculatedAmount;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(int exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    @Override
    public String toString() {
        return "CurrencyConversionBean{" +
                "id=" + id +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", calculatedAmount=" + calculatedAmount +
                ", port=" + port +
                ", quantity=" + quantity +
                ", exchangeRate=" + exchangeRate +
                '}';
    }
}
