public enum SegmentoMercado {
    NIVEL_1("Nível 1", "N1"),
    NIVEL_2("Nível 2", "N2"),
    NOVO_MERCADO("Novo Mercado", "NM");

    SegmentoMercado(String escrita, String sigla) {
        this.escrita = escrita;
        this.sigla = sigla;
    }

    public String getEscrita() {
        return this.escrita;
    }

    public String getSigla() {
        return this.sigla;
    }

    private String escrita;
    private String sigla;
}
