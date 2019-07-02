package com.ariel;

import com.ariel.entities.ArticleName;
import com.ariel.entities.CountableArticle;
import com.ariel.entities.Price;
import com.ariel.services.impl.QuantityForPriceDiscount;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuantityForPriceDiscountTest {

    @Test
    public void should_return_zero_discount() {

        //Given
        QuantityForPriceDiscount sut = new QuantityForPriceDiscount(3, new Price(1d));
        CountableArticle article = new CountableArticle(1, ArticleName.LAIT, new Price(13d), 0);


        //When
        Double discount = sut.calculateDiscount(article);

        //Then
        assertEquals(new Double(0), discount);

    }

    @Test
    public void should_return_0_discount() {

        //Given
        QuantityForPriceDiscount sut = new QuantityForPriceDiscount(3, new Price(1d));
        CountableArticle article = new CountableArticle(1, ArticleName.LAIT, new Price(10d), 2);


        //When
        Double discount = sut.calculateDiscount(article);

        //Then
        assertEquals(new Double(0), discount);

    }

    @Test
    public void should_return_29_discount() {

        //Given
        QuantityForPriceDiscount sut = new QuantityForPriceDiscount(3, new Price(1d));
        CountableArticle article = new CountableArticle(1, ArticleName.LAIT, new Price(10d), 3);


        //When
        Double discount = sut.calculateDiscount(article);

        //Then
        assertEquals(new Double(29), discount);

    }

    @Test
    public void should_return_58_discount() {

        //Given
        QuantityForPriceDiscount sut = new QuantityForPriceDiscount(3, new Price(1d));
        CountableArticle article = new CountableArticle(1, ArticleName.LAIT, new Price(10d), 8);


        //When
        Double discount = sut.calculateDiscount(article);

        //Then
        assertEquals(new Double(58), discount);

    }
}