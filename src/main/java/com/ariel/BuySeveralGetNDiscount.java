package com.ariel;

public class BuySeveralGetNDiscount implements Discount<CountableArticle> {

    private final int boughtElements ;
    private final int freeElements;

    public BuySeveralGetNDiscount(int boughtElements, int freeElements) {
        this.boughtElements = boughtElements;
        this.freeElements = freeElements;
    }

    @Override
    public Double calculateDiscount(CountableArticle article) {

        double totalDiscount = article.total() - ((article.getQuantity()/boughtElements) * freeElements * article.getPrice().getValue() + (article.getQuantity()%boughtElements) * article.getPrice().getValue());

        return totalDiscount;
    }

}
