public class Ave extends Animal {
    Asas tipoAsas = Asas.DUAS_ASAS;
    Bico tipoBico = Bico.FINO;

    public Asas getTipoAsas() {
        return tipoAsas;
    }
}

enum Asas {
    DUAS_ASAS;
}

enum Bico {
    FINO;
}

enum Dieta {
    CARNES, OVOS;
}