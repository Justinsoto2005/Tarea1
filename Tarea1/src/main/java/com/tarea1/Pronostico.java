package com.tarea1;

public class Pronostico {
    String prediccion;
    CategoriaPronostico categoria;
    Evento evento;
    EstadoPronostico estado;

    public void actualizarEstado(EstadoPronostico nuevoEstado){
        EstadoPronostico.gestionarEstado(this);
        this.estado = nuevoEstado;
    }
}
