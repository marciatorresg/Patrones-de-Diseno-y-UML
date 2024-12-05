package com.mycompany.main;

public class AprobacionGerente extends ManejadorBase {
    @Override
    public void manejar(Solicitud solicitud) {
        if (solicitud.getMonto() > 1000) {
            System.out.println("El gerente aprueba la reposición del producto.");
        } else {
            System.out.println("No se requiere aprobación del gerente.");
        }
    }
}
