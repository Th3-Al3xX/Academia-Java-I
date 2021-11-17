package lista.semana1;

import java.util.Scanner;

public class EstruturaCondicional {
    static Scanner entrada = new Scanner(System.in);

    /**
     * 7. Determinar se um número P lido é par ou ímpar.
     */
    public static void fazerExercicio7() {
        System.out.print("Digite um número para eu determinar se é par ou ímpar: ");
        int p = entrada.nextInt();

        // Operador ternário é um if-else que funciona como expressão,
        // ao invés de sentença
        // (expr_predicado) ? (expressão_verdade) : (expressão_falsa)
        String resultado = isPar(p) ? "par" : "ímpar";
        /*if (isPar(p)) {
            resultado = "par";
        } else {
            resultado = "ímpar";
            //System.out.println("Passei pelo ímpar.");
        }*/
        
        System.out.println("O número é " + resultado + "!");
    }

    public static boolean isPar(int num) {
        return num%2 == 0;
    }
}
