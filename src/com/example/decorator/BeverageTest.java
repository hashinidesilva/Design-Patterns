package com.example.decorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class BeverageTest {

    public static void main(String[] args) {
        Cappuccino cappuccino = new Cappuccino();
        SugarAddOn sugarCap = new SugarAddOn(cappuccino);
        System.out.println(sugarCap.getDescription() + " : " + sugarCap.getCost());
        MilkAddOn milkCap = new MilkAddOn(sugarCap);
        System.out.println(milkCap.getDescription() + " : " + milkCap.getCost());

        try {
            FileInputStream fileInputStream = new FileInputStream("/objects.gz");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream); //

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}