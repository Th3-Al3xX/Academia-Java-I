import java.util.Scanner;

public class exercicio2{
    static Scanner leitor = new Scanner (System.in);
    public static void main (String... args){
        System.out.print("Entre com um valor de nove digitos: ");
        String valor = leitor.nextLine();

        String resultado = numeroFormatado(valor);

        System.out.println(resultado);
    }

    private static String numeroFormatado(String valor){
        String dig1 = valor.substring(0,1);
        String dig2 = valor.substring(1,4);
        String dig3 = valor.substring(4,7);
        String dig4 = valor.substring(7,9);

        return dig1+"."+dig2+"."+dig3+","+dig4;
    }
}