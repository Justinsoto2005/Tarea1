package com.tarea1;

public class EstadoFallido implements EstadoPronostico {
    public void gestionarEstado(Pronostico pronostico){
        pronostico.estado = this;
        System.out.println("Estado cambiado a Fallido");
    }

}
