import java.util.Scanner;

public class exercicio22 {
    static Scanner leitor = new Scanner (System.in);
    public static void main (String... args){
       
        System.out.print("\nEntre com um texto para verificar quantos caracteres tem: \n");
        String texto = leitor.nextLine();

        int quant = texto.replaceAll(" ", "").length();
        
        System.out.println("\nA quantidade de caracteres é " + quant);
    }
}
