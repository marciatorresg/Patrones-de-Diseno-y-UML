package com.mycompany.main.ChainofResponsability;

public interface Manejador {
	void manejar(Solicitud solicitud);
    void setSiguiente(Manejador siguiente);
}
