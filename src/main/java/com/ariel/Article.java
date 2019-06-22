package com.ariel;

public abstract class Article {

    protected final Price price;
    private final int id;

    protected Article(Price price, int id) {
        this.price = price;
        this.id = id;
    }

    public abstract Double total();

    public Price getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }
}
