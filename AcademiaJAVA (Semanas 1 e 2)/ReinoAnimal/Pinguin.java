public class Pinguin extends Ave
implements Caminhante, Nadador {
    
    @Override
    public void caminhar() {
        System.out.println("Pinguin caminhou.");
    }

    @Override
    public void nadar() {
        System.out.println("Pinguin nadou");
    }
}
