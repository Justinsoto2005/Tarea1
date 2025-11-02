package tarea1;
public class Apostador extends Usuario {
    private int saldoPuntos;
    private int ranking;

    public Apostador(String idUsuario, String nombre, String email) {
        super(idUsuario, nombre, email);
        this.saldoPuntos = 0;
        this.ranking = 0;
    }

    public Pronostico realizarPronostico() {

    }

    public void canjearPuntos() {

    }
}