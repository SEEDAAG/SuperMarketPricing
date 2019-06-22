package com.ariel;

import java.util.Map;

public interface DiscountProvider {
    Map<Integer, Discount> getPromotions();
}
