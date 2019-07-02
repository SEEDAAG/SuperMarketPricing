package com.ariel.services.model;

import com.ariel.entities.Article;

public interface Discount< T extends Article> {

   default Double calculateDiscount(T article) {
       return 0d;
   }
}
