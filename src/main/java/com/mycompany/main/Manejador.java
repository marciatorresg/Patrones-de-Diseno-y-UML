package com.mycompany.main;

public interface Manejador {
	void manejar(Solicitud solicitud);
    void setSiguiente(Manejador siguiente);
}
