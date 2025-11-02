package tarea1;
public abstract class Usuario {
    protected String idUsuario;
    protected String nombre;
    protected String email;

    public Usuario(String idUsuario, String nombre, String email) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.email = email;
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