package org.lessons.java.shop;

import java.math.BigDecimal;

public class Product {
    // FIELDS
    private final int numberCode;
    private String name;
    private String description;
    private BigDecimal vat;
    private BigDecimal price;

    // CONSTRUCTORS
    public Product(int numberCode, String name, String description, BigDecimal vat, BigDecimal price) {
        this.numberCode = numberCode;
        this.name = name;
        this.description = description;
        this.vat = vat;
        this.price = price;
    }

    // GETTERS & SETTERS
    // Getter per rendere accessibile in lettura il codice prodotto
    public int getNumberCode() {
        return numberCode;
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

    // Getter for vat
    public BigDecimal getVat() {
        return vat;
    }

    // Setter for vat
    public void setVat(BigDecimal vat) {
        this.vat = vat;
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
        BigDecimal vatOnPrice = price.multiply(vat);
        return price.add(vatOnPrice);
    }

    // Metodo per ottenere il nome esteso: codice + nome prodotto
    public String getFullName() {
        return numberCode + "-" + name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Codice prodotto: ").append(getNumberCode()).append("\n");
        sb.append("Nome: ").append(getName()).append("\n");
        sb.append("Descrizione: ").append(getDescription()).append("\n");
        sb.append("Prezzo (IVA esclusa): ").append(getPrice()).append("\n");
        sb.append("IVA: ").append(getVat().multiply(new BigDecimal(100))).append("\n");
        sb.append("Nome esteso (codice + nome prodotto): ").append(getFullName()).append("\n");
        sb.append("Prezzo (IVA inclusa): ").append(getTotalPrice()).append("\n");
        return sb.toString();
    }
}
