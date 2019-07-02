package com.ariel.entities;

public class CountableArticle extends Article {

    private final int quantity;
    public CountableArticle(int id, ArticleName articleName, Price price, int quantity) {
        super( id, articleName, price);
        this.quantity = quantity;
    }

    public Double total() {
        return quantity * price.getValue();
    }

    public int getQuantity() {
        return quantity;
    }
}
