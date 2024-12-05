package com.mycompany.main.ChainofResponsability;

public class ConstatarFallo extends ManejadorBase {
    @Override
    public void manejar(Solicitud solicitud) {
        if ("Fallo cubierto".equalsIgnoreCase(solicitud.getDetalle())) {
            System.out.println("El fallo esta cubierto por la garantia.");
            pasarASiguiente(solicitud);
        } else {
            System.out.println("El fallo no esta cubierto por la garantia.");
        }
    }
}
