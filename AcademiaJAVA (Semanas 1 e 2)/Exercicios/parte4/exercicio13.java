public class exercicio13 {

    public static void main(String... args) {
        int qValores = 863 - 348;
        int[] pares = new int[qValores/2 + 1];
        int[] impares = new int[qValores/2 + 1];

        int somarPares = 0;
        int somarImpares = 0;
        int marcarPares = 0;
        int marcadorImpares = 0;

        for (int n=348; n <= 863; n++) {
            if (Par(n)) {
                pares[marcarPares] = n;
                marcarPares++;

                somarPares += n;
            } else {
                impares[marcadorImpares] = n;
                marcadorImpares++;

                somarImpares += n;
            }
        }

        System.out.print("\nNúmeros pares: ");
        for (int par : pares) {
            System.out.print(par + " ");
        }

        System.out.print("\n\nNúmeros ímpares: ");
        for (int impar : impares) {
            System.out.print(impar + " ");
        }

        System.out.printf("\n\nSoma dos pares é %d e dos ímpares %d.\n", 
                somarPares, somarImpares);
    }

    public static boolean Par(int num) {
        return num%2 == 0;
    }
}