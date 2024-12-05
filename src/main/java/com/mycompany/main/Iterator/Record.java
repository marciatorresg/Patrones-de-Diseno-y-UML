/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main.Iterator;

/**
 *
 * @author User
 */
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Record {
    private Date date;
    private List<Product> products;

    public Record(Date date) {
        this.date = date;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void deleteProduct(Product product) {
        products.remove(product);
    }
}
