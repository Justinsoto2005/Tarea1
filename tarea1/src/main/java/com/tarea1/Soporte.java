package com.tarea1;

public class Soporte {
    public void gestionarReporte(Pronostico pronostico){
        System.out.println("Reporte gestionado para el pronóstico: " + pronostico.prediccion);
    }

    public void escalarReporte(Pronostico pronostico){
        System.out.println("Reporte escalado a Control de Calidad para el pronóstico: " + pronostico.prediccion);
        
    }
}
