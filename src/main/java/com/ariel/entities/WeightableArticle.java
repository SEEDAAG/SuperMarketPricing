package com.ariel.entities;

public class WeightableArticle extends Article {


    private final double weight;

    public WeightableArticle(int id, ArticleName articleName, Price price, double weight) {
        super(id, articleName, price);
        this.weight = weight;
    }

    public Double total() {
        return price.getValue()*weight/16;
    }

    public double getWeight() {
        return weight;
    }
}
