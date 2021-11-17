import java.util.Scanner;

public class Sentencas {
    static Scanner leitor = new Scanner(System.in);

    public static void main(String... args) {
        double poupanca;
        double rendaAno;
        
        System.out.print("Escreva o valor base de sua poupanca: R$ ");
        poupanca = Double.parseDouble(leitor.nextLine());

        System.out.print("Escreva a renda ano, em ponto-flutuante: ");
        rendaAno = Double.parseDouble(leitor.nextLine());

        //double jurosDezAnos = jurosCompostos(poupanca, rendaAno, 10);
        System.out.println("A renda de R$ " + poupanca + " em 10 anos é: R$ "
            + jurosCompostos(poupanca, rendaAno, 10) + ".");
    }

    public static double jurosCompostos(double valorInicial, double taxa, double periodoAnos) {
        double resultado = valorInicial * Math.pow(1+taxa, periodoAnos);
        return resultado;
    }
}

// poupanca != Poupanca != pOUPANCA != PoUpAnCa -> case sensitive