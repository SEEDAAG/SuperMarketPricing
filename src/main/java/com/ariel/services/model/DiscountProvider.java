package com.ariel.services.model;

import java.util.Map;

public interface DiscountProvider {
    Map<Integer, Discount> getPromotions();
}
