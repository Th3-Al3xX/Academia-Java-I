import java.util.Scanner;

import lista.semana1.Expressoes;
import lista.semana1.Strings;
import lista.semana1.VetoresListas;
import lista.semana1.EstruturaCondicional;
import lista.semana1.EstruturaRepeticao;

public class LogicaProgramacao {
    static Scanner entrada = new Scanner(System.in);

    public static void main(String... args) {
        int numEx;
        
        do {
            System.out.print("Escolha qual exercício executar, ou 0 (zero) para sair: ");
            numEx = entrada.nextInt();
            
            switch (numEx) {
                case 0: break;

                case 2:
                Expressoes.fazerExercicio2();
                break;
                
                case 7:
                EstruturaCondicional.fazerExercicio7();
                break;

                case 10:
                EstruturaRepeticao.fazerExercicio10();
                break;

                case 12:
                EstruturaRepeticao.fazerExercicio12();
                break;

                case 13:
                VetoresListas.fazerExercicio13Alternativo();
                break;
                
                case 16:
                Strings.fazerExercicio16();
                break;

                default:
                System.out.println("Número de exercício inválido.");
            }
        } while (numEx != 0);

        System.out.println("Obrigado por fazer o dever de casa!");
    }
}