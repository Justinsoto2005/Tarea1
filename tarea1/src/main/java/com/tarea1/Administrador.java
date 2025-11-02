package com.tarea1;
import java.util.List;

public class Administrador {
    public void configurarOpcionesPronostico(Evento evento, List<CategoriaPronostico> opciones ){
        evento.pronosticos.clear();
        for (CategoriaPronostico opcion : opciones){
            Pronostico pronostico = new Pronostico();
            pronostico.categoria = opcion;
            pronostico.evento = evento;
            pronostico.estado = new EstadoPendiente();
            evento.pronosticos.add(pronostico);
        }
    }
    public void gestionarReglasPuntuacion(){
        
    }
}