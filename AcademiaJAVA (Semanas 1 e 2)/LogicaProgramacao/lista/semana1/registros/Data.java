package lista.semana1.registros;

public class Data {

    // Construtor completo da classe
    public Data(int dia, Mes mes, long ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    // Acessores computados
    public DiaSemana getDiaSemana() {
        throw new RuntimeException("Esse método invocado ainda não foi implementado");
    }

    // Acessores armazenados
    public int getDia() {
        return this.dia;
    }

    public Mes getMes() {
        return this.mes;
    }

    public long getAno() {
        return this.ano;
    }

    // Atributos
    // Dia -> [1 a 31] int
    private int dia;
    // Mês -> [1 a 12] int -- ou [Janeiro, Fevereiro, ..., Dezembro] enum
    private Mes mes;
    // Ano -> [...] long 
    private long ano;
    
    // Dia da semana -> [Domingo, Segunda, ..., Sabado] enum
    // Retiramos este atributo pois ele pode ser computado a partir dos outros
    //private DiaSemana diaSemana;
}
