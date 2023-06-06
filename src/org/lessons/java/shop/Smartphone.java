package org.lessons.java.shop;

import java.math.BigDecimal;

public class Smartphone extends Product {
    private String imei; // utilizzo String perché il codice IMEI è un codice numerico di 15 cifre
    private int amountMemory;

    public Smartphone(int numberCode, String name, String description, BigDecimal vat, BigDecimal price, String imei, int amountMemory) {
        super(numberCode, name, description, vat, price);
        this.imei = imei;
        this.amountMemory = amountMemory;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("IMEI: ").append(imei).append("\n");
        sb.append("Quantità di memoria: ").append(amountMemory).append("\n");
        return sb.toString();
    }
}
