package org.lessons.java.shop;

import java.math.BigDecimal;

public class Television extends Product {
    private int sizes;
    private boolean isSmart;

    public Television(int numberCode, String name, String description, BigDecimal vat, BigDecimal price, int sizes, boolean isSmart) {
        super(numberCode, name, description, vat, price);
        this.sizes = sizes;
        this.isSmart = isSmart;
    }
}
