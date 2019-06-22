package com.ariel;

import java.util.List;

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
