package tarea1;
public abstract class Usuario {
    protected String idUsuario;
    protected String nombre;
    protected String email;
    List<Pronostico> pronosticos;

    public Usuario(String idUsuario, String nombre, String email) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.email = email;
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
    
    public String getIdUsuario(){ 
        return idUsuario; 
    }
    public String getNombre() { 
        return nombre; 
    }
    public String getEmail() {
         return email; 
    }
}
