import java.util.List;

public class Zoologico {
    public static void main(String... args) {
        Pinguin p1 = new Pinguin();
        Arara a1 = new Arara();
        
        List<Caminhante> animaisCaminhantes = List.of(p1, a1);
        List<Voador> animaisVoadores = List.of(a1);
        List<Cantor> animaisCantores = List.of(a1);
        List<Ave> avesGerais = List.of(p1,a1);

        for (Caminhante animal : animaisCaminhantes) {
            animal.caminhar();
        }

        for (Voador animal : animaisVoadores) {
            animal.voar();
        }

        for (Cantor animal : animaisCantores) {
            animal.cantar();
        }

        for (Ave ave : avesGerais) {
            System.out.println(ave.getTipoAsas());
        }
    }
}