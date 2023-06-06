package org.lessons.java.shop;

import java.math.BigDecimal;

public class Headphone extends Product {
    private String color;
    private boolean isWireless;

    public Headphone(int numberCode, String name, String description, BigDecimal vat, BigDecimal price, String color, boolean isWireless) {
        super(numberCode, name, description, vat, price);
        this.color = color;
        this.isWireless = isWireless;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Colore cuffie: ").append(color).append("\n");
        sb.append("Sono wireless? ").append(isWireless ? "Sì" : "No").append("\n");
        return sb.toString();
    }
}
