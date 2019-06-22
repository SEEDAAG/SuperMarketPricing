package com.ariel;

public class WeightableArticle extends Article {


    private final double weight;

    public WeightableArticle(int id, Price price, double weight) {
        super(price, id);
        this.weight = weight;
    }

    public Double total() {
        return price.getValue()*weight/16;
    }

    public double getWeight() {
        return weight;
    }
}
