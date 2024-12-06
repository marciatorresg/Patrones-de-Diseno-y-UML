/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main.Iterator;

/**
 *
 * @author Gino Leonardo
 */
public class Product {
private String cod;
    private String name;
    private String state;

    public Product(String cod, String name, String state) {
        this.cod = cod;
        this.name = name;
        this.state = state;
    }

    public String getCod() {
        return cod;
    }

    public String getName() {
        return name;
    }

    public String getState() {
        return state;
    }

    @Override
    public String toString() {
        return "Product{" +
                "cod='" + cod + '\'' +
                ", name='" + name + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}