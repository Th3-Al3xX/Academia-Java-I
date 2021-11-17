import java.time.LocalDate;

public class SiteEsportivo {
    public static void main(String... args) {
        Partida primeiraPartida = new PartidaFutebol(
            LocalDate.of(2020, 11, 14),
            21,
            "Campeonato Brasileiro Serie A");

        Partida segundaPartida = new PartidaBasquete( // Polimorfismo
            LocalDate.of(2020, 9, 10),
            7, 
            "NBB",
            "Jose");
        
        System.out.println(primeiraPartida.getSintese());
        System.out.println(segundaPartida.getSintese());


        primeiraPartida.iniciar();
        segundaPartida.iniciar();

        segundaPartida.encerrar();
        primeiraPartida.encerrar();

        System.out.println(primeiraPartida.toString());
    }
}
