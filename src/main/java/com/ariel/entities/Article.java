package com.ariel.entities;

public abstract class Article {

    protected final Price price;
    private final int id;
    private final ArticleName articleName;

    protected Article( int id, ArticleName articleName, Price price) {
        this.id = id;
        this.articleName = articleName;
        this.price = price;
    }

    public abstract Double total();

    public Price getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }
}
