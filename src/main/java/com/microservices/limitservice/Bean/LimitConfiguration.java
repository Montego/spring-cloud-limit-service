package com.microservices.limitservice.Bean;

public class LimitConfiguration {
    private int minimum;
    private int maximum;


    public LimitConfiguration(int minimum, int maximum) {
//        super();
        this.minimum = minimum;
        this.maximum = maximum;
    }

    protected LimitConfiguration() {
    }

    public int getMaximum() {
        return maximum;
    }


    public int getMinimum() {
        return minimum;
    }


}
