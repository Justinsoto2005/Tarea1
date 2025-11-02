package com.tarea1;
import java.util.List;

public class Usuario {
    String nombre;
    String email;
    int puntos;
    List<Pronostico> pronosticos;
    public void verCalendario(){
        System.out.println("Mostrando calendario");
    }
    public void realizarPronostico(Evento evento, CategoriaPronostico categoria, String prediccion){
        Pronostico pronostico = new Pronostico();
        pronostico.evento=evento;
        pronostico.categoria=categoria;
        pronostico.prediccion=prediccion;
        pronostico.estado=new EstadoPendiente();
        pronosticos.add(pronostico);
        System.out.println("Pronóstico realizado: " + prediccion);
    }
    public void recibirNotificacion(String mensaje){
        System.out.println("Notificación recibida: " + mensaje);
    }

}
