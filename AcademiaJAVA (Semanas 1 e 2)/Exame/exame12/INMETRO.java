import java.util.Scanner;

public class INMETRO {
    static Scanner leitor = new Scanner (System.in);
    public static void main(String...args){
        System.out.print("Entre com consumo total de energia em Watts (W): ");
        int consumo = leitor.nextInt();

        String conceito = verificarConsumo(consumo);

        System.out.printf("O seu consumo é %d W e o seu conceito é %s ", consumo, conceito);
    }

    public static String verificarConsumo(int consumo){
        if (consumo <= 5){
            return "A";
        } else if (consumo > 5 && consumo <= 10){
            return "B";
        } else if (consumo > 10 && consumo <= 25){
            return "C";
        } else if (consumo > 25 && consumo <= 65){
            return "D";
        } else {
            return "E";
        }
    }
}