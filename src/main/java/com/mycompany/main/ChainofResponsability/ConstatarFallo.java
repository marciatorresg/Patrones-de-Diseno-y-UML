package com.mycompany.main.ChainofResponsability;

public class ConstatarFallo extends ManejadorBase {
    @Override
    public void manejar(Solicitud solicitud) {
        if ("Fallo cubierto".equalsIgnoreCase(solicitud.getDetalle())) {
            System.out.println("El fallo está cubierto por la garantía.");
            pasarASiguiente(solicitud);
        } else {
            System.out.println("El fallo no está cubierto por la garantía.");
        }
    }
}
