import java.util.Scanner;

public class exercicio17 {
    static Scanner leitor = new Scanner (System.in);
    public static void main (String... args){
        int quant = 0;
        
        System.out.print("\nEntre com um texto para verificar quantas palavras tem: \n");
        String texto = leitor.nextLine();

        String [] arrayStrings = texto.split(" ");

        for (int i = 0; i < arrayStrings.length; i++){
            quant++;
        }
        
        System.out.println("\nA quantidade de palavras é " + quant);
    }
}
