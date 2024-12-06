/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main.Iterator;

import java.util.List;

/**
 *
 * @author Gino Leonardo
 */
public class WebIterator implements ProductIterator {
   private List<Product> products;
    private int position = 0;

    public WebIterator(List<Product> products) {
        this.products = products;
    }

    @Override
    public boolean hasNext() {
        return position < products.size();
    }

    @Override
    public Product getNext() {
        if (hasNext()) {
            return products.get(position++);
        }
        return null;
    }
}