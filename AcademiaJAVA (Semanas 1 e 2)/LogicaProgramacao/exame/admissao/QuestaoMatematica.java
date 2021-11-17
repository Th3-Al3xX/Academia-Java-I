package exame.admissao;

import java.util.Scanner;

public class QuestaoMatematica {

    // Atributos de classe
    static Scanner input = new Scanner(System.in);
    static String qualquerCoisa = "Um mero teste";

    public static void fazerExercicio() {
        System.out.println("Entre com os valores de x e limite de n: ");
        int x = input.nextInt();
        int nLim = input.nextInt();

        System.out.println("O resultado foi " + calcularAproximacaoNeperiana(x, nLim) + ".");
    }

    public static double calcularAproximacaoNeperiana(int x, int nLimite) {
        double somatorio = 0;
        for (int n = 0; n <= nLimite; n++) {
            somatorio += Math.pow(x, n) / fatorial(n);
        }

        return somatorio;
    }

    private static int fatorial(int num) {
        int acumulador = 1;
        while (num > 0) {
            acumulador *= num; // acumulador = acumulador * num;
            num--;
        }

        return acumulador;
    }
}
