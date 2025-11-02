package com.tarea1;

public class ControlCalidad {
    public void revisarPronostico(Pronostico pronostico){
        if (pronostico.categoria.validarPronostico(pronostico)){
            System.out.println("Pronóstico válido");
        }else{
            System.out.println("Pronóstico inválido");
        }
    }
}
