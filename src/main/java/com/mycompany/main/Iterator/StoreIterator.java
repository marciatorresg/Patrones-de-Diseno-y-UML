/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main.Iterator;

/**
 *
 * @author User
 */
import java.util.List;

public class StoreIterator implements ProductIterator {
    private List<Product> products;
    private int position = 0;

    public StoreIterator(List<Product> products) {
        this.products = products;
    }

    @Override
    public boolean hasNext() {
        return position < products.size();
    }

    @Override
    public Product getNext() {
        return hasNext() ? products.get(position++) : null;
    }
}
