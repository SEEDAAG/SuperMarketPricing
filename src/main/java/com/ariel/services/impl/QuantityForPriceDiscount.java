package com.ariel.services.impl;

import com.ariel.entities.CountableArticle;
import com.ariel.entities.Price;
import com.ariel.services.model.Discount;

public class QuantityForPriceDiscount implements Discount<CountableArticle> {


    private final int quantity;
    private final Price price;

    public QuantityForPriceDiscount(int quantity, Price price) {
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public Double calculateDiscount(CountableArticle article) {
          double totalDiscount= (article.getQuantity() %  quantity)* article.getPrice().getValue() +  (article.getQuantity()/quantity)* price.getValue();
        return article.total() - totalDiscount;
    }
}
