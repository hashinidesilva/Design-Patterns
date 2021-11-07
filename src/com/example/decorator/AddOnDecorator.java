package com.example.decorator;

public abstract class AddOnDecorator implements Beverage {
    public Beverage beverage;

    public AddOnDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public abstract String getDescription();

    @Override
    public abstract Double getCost();
}