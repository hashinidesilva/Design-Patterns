package com.example.decorator;

public class Espresso implements Beverage {

    @Override
    public String getDescription() {
        return "Espress";
    }

    @Override
    public Double getCost() {
        return 15.0;
    }
}