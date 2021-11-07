package com.example.decorator;

public class MilkAddOn extends AddOnDecorator {

    public MilkAddOn(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " with Milk";
    }

    @Override
    public Double getCost() {
        return beverage.getCost() + 2.0;
    }
}