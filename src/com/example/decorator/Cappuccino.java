package com.example.decorator;

public class Cappuccino implements Beverage {

    @Override
    public String getDescription() {
        return "Cappuccino";
    }

    @Override
    public Double getCost() {
        return 10.0;
    }
}