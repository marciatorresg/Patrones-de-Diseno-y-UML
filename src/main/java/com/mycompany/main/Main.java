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

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
      //Chain of responsability
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
      
      
      
      //Strategy
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

