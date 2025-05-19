package com.pluralsight.finance;

public abstract class FixedAsset implements Valuable {
    protected String name;
    protected double marketValue;

    public FixedAsset(String name, double marketValue) {
        this.name = name;
        this.marketValue = marketValue;
    }

    public String getName() {
        return name;
    }

    public double getMarketValue() {
        return marketValue;
    }

    public double getValue(){
        return marketValue;
    }
}
