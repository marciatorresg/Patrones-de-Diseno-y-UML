package com.mycompany.main.ChainofResponsability;

public class Solicitud {
    private String tipo;
    private String detalle;
    private double monto;

    public Solicitud(String tipo, String detalle, double monto) {
        this.tipo = tipo;
        this.detalle = detalle;
        this.monto = monto;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDetalle() {
        return detalle;
    }

    public double getMonto() {
        return monto;
    }
}

