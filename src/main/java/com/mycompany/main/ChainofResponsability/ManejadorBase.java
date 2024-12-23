package com.mycompany.main.ChainofResponsability;

import com.mycompany.main.ChainofResponsability.Manejador;

public abstract class ManejadorBase implements Manejador {
    private Manejador siguiente;

    @Override
    public void setSiguiente(Manejador siguiente) {
        this.siguiente = siguiente;
    }

    protected void pasarASiguiente(Solicitud solicitud) {
        if (siguiente != null) {
            siguiente.manejar(solicitud);
        } else {
            System.out.println("No hay mas manejadores en la cadena.");
        }
    }
}
