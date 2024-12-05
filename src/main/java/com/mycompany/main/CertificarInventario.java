package com.mycompany.main;

public class CertificarInventario extends ManejadorBase {
    @Override
    public void manejar(Solicitud solicitud) {
        System.out.println("Verificando inventario en bodega...");
        pasarASiguiente(solicitud);
    }
}
