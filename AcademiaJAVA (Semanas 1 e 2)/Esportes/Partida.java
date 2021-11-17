import java.time.LocalDate;

public abstract class Partida {
    
    public Partida(LocalDate diaDaPartida, int rodada, String campeonato) {
        this.diaDaPartida = diaDaPartida;
        this.rodada = rodada;
        this.campeonato = campeonato;
    }

    public abstract void iniciar();

    /**
     * Este método será invocado quando as regras especificarem
     * o fim da partida, seja por tempo, por pontos, ou outros
     * critérios específicos do jogo em questão.
     */
    public abstract void encerrar();
    /*public void encerrar() {
        throw new RuntimeException("Esse método nunca poderá ser implementado aqui. Ele deve ser sobrescrito.");
    }*/

    @Override
    public boolean equals(Object obj) {
        Partida outro = (Partida) obj;

        return this.diaDaPartida.equals(outro.diaDaPartida)
            && this.rodada == outro.rodada
            && this.campeonato.equals(outro.campeonato);
    }

    public String getSintese() {
        return "Data " + diaDaPartida
            + ", rodada " + rodada
            + ", pelo Campeonato " + campeonato + ".";
    }

    public LocalDate getDiaDaPartida() {
        return diaDaPartida;
    }

    public int getRodada() {
        return rodada;
    }

    public String getCampeonato() {
        return campeonato;
    }

    private LocalDate diaDaPartida;
    private int rodada;
    private String campeonato;
}
