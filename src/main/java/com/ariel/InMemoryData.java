package com.ariel;

import java.util.HashMap;
import java.util.Map;

public class InMemoryData implements DiscountProvider{

    private Map<Integer, Discount> promotions = new HashMap<>();

    public InMemoryData() {
        this.promotions.put(1, new BuySeveralGetNDiscount(3, 2));
        this.promotions.put(2, new QuantityForPriceDiscount(3,new Price(1d)));

    }

    @Override
    public Map<Integer, Discount> getPromotions() {
        return promotions;
    }
}
