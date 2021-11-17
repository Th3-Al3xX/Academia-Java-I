public class Arara extends Ave
implements Voador, Caminhante, Cantor {
    
    @Override
    public void voar() {
        System.out.println("Arara voou.");
    }

    @Override
    public void caminhar() {
        System.out.println("Arara caminhou.");
    }

    @Override
    public void cantar() {
        System.out.println("Arara cantou.");
    }
}
