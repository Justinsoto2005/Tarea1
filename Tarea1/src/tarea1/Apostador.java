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

    public Pronostico realizarPronostico(Evento evento, ICategoriaPronostico categoria, String valorPredicho) {
        if (evento.estaAbierto() && categoria.validar(valorPredicho)) {
            Pronostico p = new Pronostico(this, evento, categoria, valorPredicho);
            this.pronosticos.add(p);
            return p;
        }
        return null;
    }

    public void canjearPuntos(Premio premio) {
        if (this.saldoPuntos >= premio.getCostoPuntos()) {
            this.saldoPuntos -= premio.getCostoPuntos();
        }
    }
}