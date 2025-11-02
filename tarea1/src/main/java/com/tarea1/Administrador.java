package com.tarea1;
<<<<<<< HEAD
=======

>>>>>>> dfed254f9bf7c4d2247af713ca706928c0c75111
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
<<<<<<< HEAD
}
=======
}
>>>>>>> dfed254f9bf7c4d2247af713ca706928c0c75111
