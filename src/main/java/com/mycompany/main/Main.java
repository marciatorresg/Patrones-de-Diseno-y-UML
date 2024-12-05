/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {

        Manejador verificarGarantia = new VerificarGarantia();
        Manejador constatarFallo = new ConstatarFallo();
        Manejador certificarInventario = new CertificarInventario();
        Manejador aprobacionGerente = new AprobacionGerente();


        verificarGarantia.setSiguiente(constatarFallo);
        constatarFallo.setSiguiente(certificarInventario);
        certificarInventario.setSiguiente(aprobacionGerente);


        Solicitud solicitud = new Solicitud("Garantia", "Fallo cubierto", 1500);


        verificarGarantia.manejar(solicitud);
    }
}

