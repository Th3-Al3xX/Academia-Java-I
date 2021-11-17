import java.util.Scanner;

public class exercicio16{
    static Scanner leitor = new Scanner (System.in);
    public static void main (String... main){

        String dataEnt;
        do {
            System.out.print("Escreva uma data no formato DD/MM/AAA: ");
            dataEnt = leitor.nextLine().strip();
        } while(!isFormatoData(dataEnt));

        String formatSaida = inverterData(dataEnt);
        System.out.println("\nA data no formato invertido é " + formatSaida);
    }

    private static String inverterData(String dataEnt){
        String[] numData = dataEnt.split("/");
        return numData[2] + numData[1] + numData[0];
    }

    private static boolean isFormatoData(String dataEnt){
        if (dataEnt.length() !=10){return false;}
        if (dataEnt.charAt(2) != '/' || dataEnt.charAt(5) != '/'){return false;}

        try{
            int dia = Integer.parseInt(dataEnt.substring(0,2));
            if (dia < 1 || dia > 31) {return false;}
            
            int mes = Integer.parseInt(dataEnt.substring(3,5));
            if (mes < 1 || mes > 12) {return false;}

            int ano = Integer.parseInt(dataEnt.substring(6,10));
            if (ano < 0) {return false;}
        } catch (NumberFormatException e){return false;}
        return true;
    }
}