package org.lessons.java.shop;

import java.math.BigDecimal;

public class Smartphone extends Product {
    private int imei;
    private int amountMemory;

    public Smartphone(int numberCode, String name, String description, BigDecimal vat, BigDecimal price, int imei, int amountMemory) {
        super(numberCode, name, description, vat, price);
        this.imei = imei;
        this.amountMemory = amountMemory;
    }
}
