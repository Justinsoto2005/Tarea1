package tarea1;
public class Apostador extends Usuario {
    private int saldoPuntos;
    private int ranking;
    private List<Pronostico> pronosticos;

    public Apostador(String idUsuario, String nombre, String email) {
        super(idUsuario, nombre, email);
        this.saldoPuntos = 0;
        this.ranking = 0;
        this.pronosticos = new ArrayList<>();
    }

    public Pronostico realizarPronostico() {

    }

    public void canjearPuntos() {
        
    }
}