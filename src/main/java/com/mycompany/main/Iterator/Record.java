/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main.Iterator;
/**
 *
 * @author Gino Leonardo
 */
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Record {
    private Date date;
    private List<Product> products; // Lista de productos

    public Record(Date date) {
        this.date = date;
        this.products = new ArrayList<>();
    }

    // Agregar un producto a la lista
    public void addProduct(Product product) {
        products.add(product);
    }

    // Eliminar un producto de la lista
    public void deleteProduct(Product product) {
        products.remove(product);
    }

    // Obtener la lista de productos
    public List<Product> getProducts() {
        return products;
    }

    // Obtener la fecha del registro
    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Record{" +
                "date=" + date +
                ", products=" + products +
                '}';
    }
}