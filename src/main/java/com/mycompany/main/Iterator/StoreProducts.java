/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main.Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gino Leonardo
 */
public class StoreProducts implements ListProducts {
     private final PRecord registro;

    public StoreProducts(PRecord registro) {
        this.registro=registro;
        // Add some products to the list
    }

    @Override
    public ProductIterator createList() {
        return new StoreIterator(registro.getProducts());
    }
}