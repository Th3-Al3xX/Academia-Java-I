package lista.semana1;

import java.util.ArrayList;
import java.util.List;

public class VetoresListas {

    public static void fazerExercicio13Alternativo() {
        List<Integer> pares = new ArrayList<Integer>();
        List<Integer> impares = new ArrayList<Integer>();

        int somaPares = 0;
        int somaImpares = 0;
        for (int n=348; n <= 863; n++) {
            if (EstruturaCondicional.isPar(n)) {
                pares.add(n);
                somaPares += n;
            } else {
                impares.add(n);
                somaImpares += n;
            }
        }

        System.out.print("Os números pares são: ");
        for (int i=0; i < pares.size(); i++) {
            System.out.print(pares.get(i) + " ");
        }

        System.out.print("\nOs números ímpares são: ");
        for (int impar : impares) {
            System.out.print(impar + " ");
        }

        System.out.printf("\nSoma de pares é %d e ímpares %d.\n", 
                somaPares, somaImpares);
    }

    /**
     * 13. Elabore um algoritmo para armazenas em vetores, distintos, os
     * números pares e ímpares contidos entre os números 348 e 863,
     * inclusive. Após, mostre o conteúdo desses vetores, e a soma dos
     * números pares e ímpares contidos neles.
     */
    public static void fazerExercicio13() {
        int qtdeValores = 863 - 348;
        int[] pares = new int[qtdeValores/2 + 1];
        int[] impares = new int[qtdeValores/2 + 1];

        int somaPares = 0;
        int somaImpares = 0;
        int marcadorPares = 0;
        int marcadorImpares = 0;
        for (int n=348; n <= 863; n++) {
            /*if (marcadorPares == 257) {
                boolean parada = true;
            }*/ // Código que usamos para breakpoint

            if (EstruturaCondicional.isPar(n)) {
                pares[marcadorPares] = n;
                marcadorPares++;

                somaPares += n;
            } else {
                impares[marcadorImpares] = n;
                marcadorImpares++;

                somaImpares += n;
            }
        }

        System.out.print("Os números pares são: ");
        for (int par : pares) {
            System.out.print(par + " ");
        }

        System.out.print("\nOs números ímpares são: ");
        for (int impar : impares) {
            System.out.print(impar + " ");
        }

        System.out.printf("\nSoma de pares é %d e ímpares %d.\n", 
                somaPares, somaImpares);
    }
}
