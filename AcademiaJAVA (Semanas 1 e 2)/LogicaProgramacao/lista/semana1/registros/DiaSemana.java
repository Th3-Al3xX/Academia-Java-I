package lista.semana1.registros;

public enum DiaSemana {
    DOMINGO(1), SEGUNDA(2), TERCA(3), QUARTA(4), QUINTA(5), SEXTA(6), SABADO(7);

    DiaSemana(int numDiaSemana) {
        this.numDiaSemana = numDiaSemana;
    }

    public int getNumDiaSemana() {
        return this.numDiaSemana;
    }

    // Modificadores: exemplo este private e final.
    private final int numDiaSemana;
}
