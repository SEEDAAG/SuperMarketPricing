package com.ariel;

public class XForYDiscount implements Discount<CountableArticle> {

    private final int x;
    private final int y;

    public XForYDiscount(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public Double calculateDiscount(CountableArticle article) {

        double totalDiscount = article.total() - ((article.getQuantity()/x) * y * article.getPrice().getValue() + (article.getQuantity()%x) * article.getPrice().getValue());

        return totalDiscount;
    }

}
