package com.ariel;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BasketTest {

    @Test
    public void should_return_72_for_total_with_discount() {

        //Given

        List<Article> articles = new ArrayList<>();

        articles.add(new CountableArticle(2, new Price(10d), 8));
        articles.add(new CountableArticle(1, new Price(10d), 7));

        Basket basket = new Basket(articles,new InMemoryData() );

        //When

        Double total =  basket.totalWithDiscount();


        //Then

        assertEquals(new Double(72), total );
    }

    @Test
    public void should_return_150_for_total_without_discount() {

        //Given

        List<Article> articles = new ArrayList<>();

        articles.add(new CountableArticle(2, new Price(10d), 8));
        articles.add(new CountableArticle(1, new Price(10d), 7));

        Basket basket = new Basket(articles,new InMemoryData() );

        //When

        Double total =  basket.total();


        //Then

        assertEquals(new Double(150), total );
    }

    @Test
    public void should_return_78_as_total_discount() {

        //Given

        List<Article> articles = new ArrayList<>();

        articles.add(new CountableArticle(2, new Price(10d), 8));
        articles.add(new CountableArticle(1, new Price(10d), 7));

        Basket basket = new Basket(articles,new InMemoryData() );

        //When

        Double total =  basket.totalDiscount();


        //Then

        assertEquals(new Double(78), total );
    }


    @Test
    public void should_return_82_as_total_with_discount() {

        //Given

        List<Article> articles = new ArrayList<>();

        articles.add(new CountableArticle(2, new Price(10d), 8));
        articles.add(new CountableArticle(1, new Price(10d), 7));
        articles.add(new WeightableArticle(3, new Price(10d), 16));

        Basket basket = new Basket(articles,new InMemoryData() );

        //When

        Double total =  basket.totalWithDiscount();


        //Then

        assertEquals(new Double(82), total );
    }

}