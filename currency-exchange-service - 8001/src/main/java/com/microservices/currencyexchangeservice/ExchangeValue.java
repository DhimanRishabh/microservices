package com.microservices.currencyexchangeservice;

import java.math.BigDecimal;

public class ExchangeValue {
    long id;
    String from;
    String to;
    BigDecimal exchnageRate;
    int port;
    public ExchangeValue() {
    }

    public ExchangeValue(long id, String from, String to, BigDecimal exchnageRate, int port) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.exchnageRate = exchnageRate;
        this.port = port;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public BigDecimal getExchnageRate() {
        return exchnageRate;
    }

    public void setExchnageRate(BigDecimal exchnageRate) {
        this.exchnageRate = exchnageRate;
    }
}
