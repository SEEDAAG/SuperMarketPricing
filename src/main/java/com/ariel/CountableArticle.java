package com.ariel;

public class CountableArticle extends Article {

    private final int quantity;
    public CountableArticle(int id, Price price, int quantity) {
        super(price, id);
        this.quantity = quantity;
    }

    public Double total() {
        return quantity * price.getValue();
    }

    public int getQuantity() {
        return quantity;
    }
}
