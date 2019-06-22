package com.ariel;

public interface Discount< T extends Article> {

   default Double calculateDiscount(T article) {
       return 0d;
   }
}
