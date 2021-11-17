package lista.semana1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Strings {
    static Scanner input = new Scanner(System.in);

    public static void fazerExercicio16() {

        String dataEntrada;
        do {
            System.out.print("Escreva uma data no formato DD/MM/AAAA, inclusive com as barras: ");
            dataEntrada = input.nextLine().strip();
        } while(!isFormatoData(dataEntrada));

        String formatoSaida = inverterFormatoData(dataEntrada);
        System.out.println("\nA data no formato ISO-xxxx é " + formatoSaida + ".");
    }

    private static String inverterFormatoData(String dataEntrada) {
        /*String dia = dataEntrada.substring(0,2);
        String mes = dataEntrada.substring(3,5);
        String ano = dataEntrada.substring(6,10);*/
        String[] numsData = dataEntrada.split("/");
        
        return numsData[2] + numsData[1] + numsData[0];
    }

    // Regex [0-9]{2}\/[0-9]{2}\/[0-9]{4}
    private static Pattern formatoData = Pattern.compile("^[0-9]{2}\\/[0-9]{2}\\/[0-9]{4}$");
    private static boolean isFormatoDataRegex(String dataEntrada) {
        /*Matcher matcherData = formatoData.matcher(dataEntrada);
        return matcherData.matches();*/
        return formatoData.asPredicate().test(dataEntrada);
    }

    /**
     * Ideal é usar Regex.
     * 
     * @param dataEntrada
     * @return
     */
    private static boolean isFormatoData(String dataEntrada) {        
        if (dataEntrada.length() != 10) {
            return false;
        }
        if (dataEntrada.charAt(2) != '/' || dataEntrada.charAt(5) != '/') {
            return false;
        }

        try {
            int dia = Integer.parseInt(dataEntrada.substring(0, 2));
            if (dia < 1 || dia > 31) {
                return false;
            }

            int mes = Integer.parseInt(dataEntrada.substring(3, 5));
            if (mes < 1 || mes > 12) {
                return false;
            }

            int ano = Integer.parseInt(dataEntrada.substring(6, 10));
            if (ano < 0) {
                return false;
            }
        } catch (NumberFormatException e) {
            return false;
        }

        return true;
    }
}
