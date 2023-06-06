package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.Random;

public class Product {
    // FIELDS
    private final int numberCode;
    private String name;
    private String description;
    private BigDecimal VAT;
    private BigDecimal price;

    // CONSTRUCTOR
    public Product(String name, String description, BigDecimal VAT, BigDecimal price) {
        this.numberCode = generateCode();
        this.name = name;
        this.description = description;
        this.VAT = VAT;
        this.price = price;
    }

    // GETTERS & SETTERS
    // Getter per rendere accessibile in lettura il codice prodotto
    public int getNumberCode() {
        return this.numberCode;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for description
    public String getDescription() {
        return description;
    }

    // Setter for description
    public void setDescription(String description) {
        this.description = description;
    }

    // Getter for VAT
    public BigDecimal getVAT() {
        return VAT;
    }

    // Setter for VAT
    public void setVAT(BigDecimal VAT) {
        this.VAT = VAT;
    }

    // Getter for price
    public BigDecimal getPrice() {
        return price;
    }

    // Setter for price
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    // METHODS
    public BigDecimal getTotalPrice() {
        BigDecimal vatOnPrice = price.multiply(VAT);
        return price.add(vatOnPrice);
    }

    // Metodo per ottenere il nome esteso: codice + nome prodotto
    public String getFullname() {
        return numberCode + "-" + name;
    }

    private int generateCode() {
        Random rand = new Random();
        return rand.nextInt(1000, 10000);
    }
}
