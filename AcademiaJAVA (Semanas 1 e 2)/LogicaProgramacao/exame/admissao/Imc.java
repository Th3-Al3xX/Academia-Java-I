package exame.admissao;

public enum Imc {
    // Todo enum começa com a definição de seus valores, sempre finitos e nomeados.
    SUBNITRICAO("Subnutrição"),
    NORMAL("Normal"),
    SOBREPESO("Sobrepeso"),
    OBESIDADE("Obesidade");
    
    Imc(String escrita) {
        this.escrita = escrita;
    }

    public String getEscrita() {
        return this.escrita;
    }

    // Atributos de objeto
    private String escrita;
}
