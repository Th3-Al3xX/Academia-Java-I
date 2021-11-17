import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ConsultaBolsa {
    static Scanner leitor = new Scanner (System.in);
    public static void main(String... args) {
        Map<String, Integer> carteira = lerCarteiraArquivo(Path.of("minha-carteira.csv"));
        Map<String, Double> precos = lerPrecosArquivo(Path.of("cotacoes.csv"));
        
        System.out.println("A carteira contida no arquivo é composta por:");
        double valorTotal = 0.0;
        for (String ticker : carteira.keySet()) {
            int qtdeCotas = carteira.getOrDefault(ticker, 0);
            double valorNaCarteira = qtdeCotas * precos.getOrDefault(ticker, 0.0);
            
            System.out.println("* " + ticker + ", com " + qtdeCotas 
                + " cotas, valendo R$ " + String.format("%.2f", valorNaCarteira) + ".");
            
            valorTotal += valorNaCarteira;
        }

        System.out.printf("\nO valor total da carteira é R$ %.2f.\n", valorTotal);

        boolean pergunta;

        do {
            System.out.println("Deseja adicionar uma nova ação? (True = SIM / False = NAO) ");
            pergunta = leitor.nextBoolean();

            if (pergunta == true){
                String [] novaAcao = new String [5];
                System.out.print("\n\nEntre com a Razão Social: ");
                novaAcao[0]=leitor.nextLine();

                System.out.println("\nEntre com o CNPJ: ");
                novaAcao[1]=leitor.nextLine();

                System.out.println("\nEntre com a qtde de Cotas: ");
                novaAcao[2]=leitor.nextLine();

                System.out.println("\nEntre com o ticker: ");
                novaAcao[3]=leitor.nextLine();

                System.out.println("\nEntre com o Valor da cota: ");
                novaAcao[4]=leitor.nextLine();

                Acao nova = new Acao(
                novaAcao[0], //nova Razão
                novaAcao[1], //novo CNPJ
                Long.parseLong(novaAcao[2]),
                SegmentoMercado.NOVO_MERCADO,
                novaAcao[3]);

                Map<String, Integer> carteira = gravarCarteiraArquivo(Path.of("nova-carteira.csv"),novaAcao[3],novaAcao[4]);
            }

        } while (pergunta = true);
    }

    private static Map<String, Double> lerPrecosArquivo(Path nomeArquivo) {
        Map<String, Double> precos = new HashMap<>();
        try {
            BufferedReader arquivoPreco = 
                Files.newBufferedReader(nomeArquivo);
            
            String linhaArq = arquivoPreco.readLine();
            while (linhaArq != null) {
                String[] linhaSplit = linhaArq.split(";");
                precos.put(linhaSplit[0], Double.parseDouble(linhaSplit[1]));

                linhaArq = arquivoPreco.readLine();
            }
        } catch (IOException e) {
            System.out.println("Falha no acesso ao arquivo. " + e);
            System.exit(1);
        }

        return precos;
    }

    private static Map<String, Integer> gravarCarteiraArquivo(Path nomeArquivo, String ticker, String valorCota) {
        Map<String, Integer> carteira = new HashMap<>();
        try {

            BufferedWriter arquivoCarteira = 
                Files.newBufferedWriter(nomeArquivo);
            
            String linhaArq = arquivoCarteira.write(ticker + ";" + valorCota);
            }
        } catch (IOException e) {
            System.out.println("Falha na gravação do arquivo. " + e);
            System.exit(1);
        }

        return carteira;
    }

    private static Map<String, Integer> lerCarteiraArquivo(Path nomeArquivo) {
        Map<String, Integer> carteira = new HashMap<>();
        try {
            BufferedReader arquivoCarteira = 
                Files.newBufferedReader(nomeArquivo);
            
            String linhaArq = arquivoCarteira.readLine();
            while (linhaArq != null) {
                String[] linhaSplit = linhaArq.split(";");
                carteira.put(linhaSplit[0], Integer.parseInt(linhaSplit[1]));

                linhaArq = arquivoCarteira.readLine();
            }
        } catch (IOException e) {
            System.out.println("Falha no acesso ao arquivo. " + e);
            System.exit(1);
        }

        return carteira;
    }

    // É o main antigo da classe
    public static void consultaBolsa() {
        Acao mglu = new Acao(
            "Magazine Luiza",
            "2394874/0001-17",
            6_000_000,
            SegmentoMercado.NOVO_MERCADO,
            "MGLU3");
        
        Acao weg = new Acao(
            "Weg SA",
            "1010101/0001-18",
            33_020_000,
            SegmentoMercado.NOVO_MERCADO,
            "WEGE3");
        
        Acao slcAgr = new Acao(
            "SLC Agricola",
            "123456789/0001-16",
            300_000,
            SegmentoMercado.NIVEL_2,
            "SLCZ3");
        
        double valorCotaMglu = BMFBovespa.consultarValorCota(mglu.getTicker());
        mglu.setValorCota(valorCotaMglu);

        System.out.printf("O valor de mercado de %s, do segmento %s, é R$ %.2f.\n",
                mglu.getTicker(),
                mglu.getSegmentoMercado().getSigla(), 
                mglu.getValorCota() * mglu.getQtdeCotas());
        
        Map<Acao, Integer> minhaCarteira = Map.of(
            mglu, 20,
            weg, 35
        );

        System.out.println(minhaCarteira.getOrDefault(mglu, 0));
        System.out.println(minhaCarteira.getOrDefault(slcAgr, 0));
    }
}
