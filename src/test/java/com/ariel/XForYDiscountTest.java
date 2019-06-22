package com.ariel;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class XForYDiscountTest {

    @Test
    public void should_return_0_discount_for_0_article() {

        //Given
        XForYDiscount sut = new XForYDiscount(3,2);
        CountableArticle countableArticle = new CountableArticle(1, new Price(1d), 0);

        //When
        Double discount = sut.calculateDiscount(countableArticle);


        //Then

        Assert.assertEquals(new Double(0), discount);
    }

    @Test
    public void should_return_0_discount_for_1_article() {

        //Given
        XForYDiscount sut = new XForYDiscount(3,2);
        CountableArticle countableArticle = new CountableArticle(1, new Price(10d), 1);

        //When
        Double discount = sut.calculateDiscount(countableArticle);


        //Then

        Assert.assertEquals(new Double(0), discount);
    }


    @Test
    public void should_return_10_discount_for_3_articles() {

        //Given
        XForYDiscount sut = new XForYDiscount(3,2);
        CountableArticle countableArticle = new CountableArticle(1, new Price(10d), 3);

        //When
        Double discount = sut.calculateDiscount(countableArticle);


        //Then

        Assert.assertEquals(new Double(10), discount);
    }


    @Test
    public void should_return_20_discount_for_7_articles() {

        //Given
        XForYDiscount sut = new XForYDiscount(3,2);
        CountableArticle countableArticle = new CountableArticle(1, new Price(10d), 7);

        //When
        Double discount = sut.calculateDiscount(countableArticle);


        //Then

        Assert.assertEquals(new Double(20), discount);
    }





}