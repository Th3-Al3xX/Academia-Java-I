package lista.semana1;

import java.util.Scanner;

public class Expressoes {
    static Scanner entrada = new Scanner(System.in);

    public static void fazerExercicio2() {
        int a, b, c;
        double r, s, d;

        System.out.println("Escreva três valores inteiros:");
        a = entrada.nextInt();
        b = entrada.nextInt();
        c = entrada.nextInt();

        r = calcularQuadradoSoma(a, b);
        s = calcularQuadradoSoma(b, c);
        d = calcularMedia2(r, s);

        System.out.printf("(r, s, t) = (%f, %f, %f).\n", r, s, d);
    }

    private static double calcularMedia2(double a, double b) {
        double resultado = (a+b)/2.0;
        return resultado;
    }

    private static double calcularQuadradoSoma(int a, int b) {
        double resultado = Math.pow(a+b, 2);
        return resultado;
    }
}
