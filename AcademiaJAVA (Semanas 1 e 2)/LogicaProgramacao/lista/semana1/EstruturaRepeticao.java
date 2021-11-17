package lista.semana1;

import java.util.Scanner;

public class EstruturaRepeticao {

    static Scanner entrada = new Scanner(System.in);
    
    public static void fazerExercicio12() {
        System.out.print("Escreva uma cadeia de caracteres para eu analisar:\n> ");
        String cadeiaEntrada = entrada.nextLine();

        for (int i=0; i < cadeiaEntrada.length(); i++) {
            System.out.printf("\nO caractere %d: '%s' de \"%s\" é %s.", 
                i,
                cadeiaEntrada.charAt(i),
                cadeiaEntrada,
                avaliarTipoCaractere(cadeiaEntrada.charAt(i)));
        }
        System.out.println();
    }

    private static Object avaliarTipoCaractere(char charAt) {
        if (Character.isDigit(charAt)) {
            return "dígito";
        } else if (Character.isLowerCase(charAt)) {
            return "minúsculo";
        } else if (Character.isUpperCase(charAt)) {
            return "maiúsculo";
        } else if (Character.isWhitespace(charAt)) {
            return "espaço";
        } else {
            return "símbolo";
        }
    }

    public static void fazerExercicio10() {
        System.out.println("Entre dois valores, a e b, para computar o somatorio: ");
        int a = entrada.nextInt();
        int b = entrada.nextInt();

        int resultado = calcularExpressaoSomatorio(a, b);

        System.out.println("Resultado do somatorio é: " + resultado + ".");
    }

    private static int calcularExpressaoSomatorio(int a, int b) {
        int somatorio = 0;
        //for(inicialização; teste de continuidade; atualizacao do marcador) { }
        for (int i=1; i <= a; i++) {
            for (int j=1; j <= b; j++) {
                somatorio += (a*b) + Math.floor(Math.pow(j+i, 2));
            }
        }
        return somatorio;
    }

    private static int calcularExpressaoSomatorioComWhile(int a, int b) {
        int somatorio = 0;
        int i = 1;
        while (i <= a) {
            int j = 1;
            while (j <= b) { // Iteração é quando eu faço uma passada no laço.
                somatorio += (a*b) + Math.floor(Math.pow(j+i, 2)); //somatorio = somatorio + iteracao; // Acumulação
                j++; // j+=1 -> Incremento, necessariamente quer dizer acúmulo por 1. 
            }
            i++;
        }

        return somatorio;
    }
}