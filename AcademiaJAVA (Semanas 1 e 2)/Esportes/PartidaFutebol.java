import java.time.LocalDate;

public class PartidaFutebol extends Partida {

    public PartidaFutebol(LocalDate diaDaPartida, int rodada, String campeonato) {
        super(diaDaPartida, rodada, campeonato);
    }

    private int golsHospedeiro;
    private int golsVisitante;
    private String nomeHospedeiro;
    private String nomeVisitante;
    private String escalacaoHospedeiro;
    private String escalacaoVisitante;

    public void iniciar() {
        System.out.println("Iniciada partida de futebol.");
    }

    public void encerrar() {
        System.out.println("Encerrada partida de futebol.");
    }

    @Override
    public String getSintese() {
        return super.getSintese() + "\n" +
            nomeHospedeiro + " " + golsHospedeiro + " - " + golsVisitante + " " + nomeVisitante;
    }
}