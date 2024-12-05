/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main.Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class DefectiveProducts implements ListProducts {
    private List<Product> products;

    public DefectiveProducts() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public ProductIterator createList() {
        return new DefectiveIterator(products);
    }
}
