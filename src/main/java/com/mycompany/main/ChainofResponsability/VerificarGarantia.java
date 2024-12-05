package com.mycompany.main.ChainofResponsability;

import com.mycompany.main.ChainofResponsability.Solicitud;
import com.mycompany.main.ChainofResponsability.ManejadorBase;

public class VerificarGarantia extends ManejadorBase {
    @Override
    public void manejar(Solicitud solicitud) {
        if ("Garantia".equalsIgnoreCase(solicitud.getTipo())) {
            System.out.println("Verificación de garantía realizada.");
            pasarASiguiente(solicitud);
        } else {
            System.out.println("La solicitud no es de tipo garantía.");
        }
    }
}
