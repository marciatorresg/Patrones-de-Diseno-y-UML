/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

import com.mycompany.main.ChainofResponsability.VerificarGarantia;
import com.mycompany.main.ChainofResponsability.Solicitud;
import com.mycompany.main.ChainofResponsability.Manejador;
import com.mycompany.main.ChainofResponsability.ConstatarFallo;
import com.mycompany.main.ChainofResponsability.CertificarInventario;
import com.mycompany.main.ChainofResponsability.AprobacionGerente;
import com.mycompany.main.Strategy.*;
import com.mycompany.main.Iterator.*;


/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
      //Chain of responsability
        System.out.println("\n----------------Chain of responsability------------");
        Manejador verificarGarantia = new VerificarGarantia();
        Manejador constatarFallo = new ConstatarFallo();
        Manejador certificarInventario = new CertificarInventario();
        Manejador aprobacionGerente = new AprobacionGerente();


        verificarGarantia.setSiguiente(constatarFallo);
        constatarFallo.setSiguiente(certificarInventario);
        certificarInventario.setSiguiente(aprobacionGerente);


        Solicitud solicitud = new Solicitud("Garantia", "Fallo cubierto", 1500);


        verificarGarantia.manejar(solicitud);
        
      //Iterator
        System.out.println("\n----------------Iterator------------");
        
        WebProducts webProducts = new WebProducts();
        webProducts.addProduct(new Product("001", "Laptop", "Available"));
        webProducts.addProduct(new Product("002", "Tablet", "Out of Stock"));

        ProductIterator iterator = webProducts.createList();
        while (iterator.hasNext()) {
            Product product = iterator.getNext();
            System.out.println(product.getName() + " - " + product.getState());
        }


      //Strategy
        System.out.println("\n-----------------Strategy------------------");
        Context contexto = new Context();
        contexto.setStrategy(new Automotive());
        contexto.doSomething();

        contexto.setStrategy(new Airway());
        contexto.doSomething();

        contexto.setStrategy(new Cyclist());
        contexto.doSomething();

        contexto.setStrategy(new Railway());
        contexto.doSomething();

        contexto.setStrategy(new Waterway());
        contexto.doSomething();
      

    }
}

