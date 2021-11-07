package com.example.decorator;

public class SugarAddOn extends AddOnDecorator {

    public SugarAddOn(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " with Sugar";
    }

    @Override
    public Double getCost() {
        return beverage.getCost() + 5.0;
    }
}
