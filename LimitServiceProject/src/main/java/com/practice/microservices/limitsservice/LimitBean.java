package com.practice.microservices.limitsservice;

public class LimitBean {
    int max;
    int min;

    public LimitBean() {
    }

    public LimitBean(int max, int min) {
        this.max = max;
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }
}
