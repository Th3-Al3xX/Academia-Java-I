import java.time.LocalDate;

public class PartidaBasquete extends Partida {
    private String jogadorCestinha;
    private String jogadorAssitente;

    public PartidaBasquete(LocalDate diaDaPartida, int rodada, String campeonato, String jogadorCestinha) {
        super(diaDaPartida, rodada, campeonato);

        this.jogadorCestinha = jogadorCestinha;
    }

    public void iniciar() {
        System.out.println("Iniciada partida de basquete.");
    }

    public void encerrar() {
        System.out.println("Encerrada partida de basquete.");
    }

    @Override
    public String getSintese() {
        return "Partida de basquete, " + getDiaDaPartida()
            + ", rodada " + getRodada()
            + ", pelo Campeonato " + getCampeonato() + "."
            + "\nO cestinha do dia foi " + jogadorCestinha + ".";
    }
}
