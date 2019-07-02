package com.ariel.services;

import com.ariel.entities.Article;
import com.ariel.services.model.Discount;
import com.ariel.services.model.DiscountProvider;

import java.util.List;

public class Basket {

    private final List<Article> articles;
    private final DiscountProvider discountProvider;

    public Basket(List<Article> articles, DiscountProvider discountProvider) {
        this.articles = articles;
        this.discountProvider = discountProvider;
    }

    public Double total() {
        return articles.stream()
                .map(article -> article.total())
                .reduce(0d,  Double::sum);
    }

    public Double totalWithDiscount() {
        return total() - totalDiscount() ;
    }

    public Double totalDiscount() {
        return articles.stream().map(article -> {
            if(discountProvider.getPromotions().containsKey(article.getId())) {
                Discount discount = discountProvider.getPromotions().get(article.getId());
                Double aDouble = discount.calculateDiscount(article);
                return aDouble;
            }
            return 0d;
        }).reduce(0d, Double::sum);
    }
}
