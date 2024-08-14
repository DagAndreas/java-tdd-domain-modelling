package com.booleanuk.core;

import java.util.HashMap;

public class Basket {
    public HashMap<String, Integer> items = new HashMap<>();

    public boolean add(String product, int price){
        boolean alreadyInBasket = items.containsKey(product);
        items.put(product, price);
        return alreadyInBasket;
    }

    public int total(){
        return 0;
    }
}
