import java.util.Scanner;

public class Aluno {
    static Scanner input = new Scanner(System.in);
    
    public static void main(String... args) {
        System.out.println("Escreva os dados do novo aluno, nome, matricula e serie:");
        /*String nomeLido = input.nextLine();
        String matriculaLida = input.nextLine();
        int serieLida = input.nextInt();*/

        Aluno novoAluno = new Aluno(args[0], args[1], Integer.parseInt(args[2]));

        int operacao;
        do {
            System.out.println("Qual operação proceder?"
                    + "\n\t1- Definir quantidade de trabalhos."
                    + "\n\t2- Lançar nota de trabalho."
                    + "\n\t0- Terminar programa.");
            operacao = input.nextInt();

            if (operacao == 1) {
                System.out.println("Quantos trabalhos esse aluno tem?");
                novoAluno.definirQtdeTrabalhos(input.nextInt());
            } else if (operacao == 2) {
                System.out.println("Digite a nota e o numero do trabalho:");
                int novaNota = input.nextInt();
                int numTrabalho = input.nextInt();
                novoAluno.lancarNotaTrabalho(novaNota, numTrabalho);
            }

            System.out.println("Situação do aluno novo:\n" + novoAluno.toString());
        } while (operacao != 0);
    }

    public Aluno(String nome, String matricula, int serie) {
        this.nome = nome;
        this.matricula = matricula;
        this.serie = serie;

        //this.notasBimestrais = new double[4]; // Essa inicialização já é feita na definição do atributo
    }

    public double calcularNotaFinal() {
        double notaFinal = 0;
        
        // For de iteração com índice
        /*for (int i=0; i < notasBimestrais.length; i++) {
            notaFinal += notasBimestrais[i];
        }*/

        // For do tipo for-each (para cada), com iteradores
        for (double notaBimestral : notasBimestrais) {
            notaFinal += notaBimestral;
        }

        return notaFinal;
    }

    public void definirQtdeTrabalhos(int qtde) {
        notasTrabalhos = new double[qtde];
    }

    /**
     * Lanca a nota do enésimo trabalho, indexado a partir de 1.
     * 
     * PRECOND: Não lance nota de trabalho sem definirQtdeTrabalhos antes!
     * @param nota nota do trabalho, deveria ser entre 0 e 100.
     * @param numTrabalho número do trabalho, indexado em 1.
     */
    public void lancarNotaTrabalho(double nota, int numTrabalho) {
        notasTrabalhos[numTrabalho-1] = nota;
    }

    public double consultarNotaTrabalho(int numTrabalho) {
        return notasTrabalhos[numTrabalho];
    }

    public String toString() {
        String dadosCadastrais = nome + ", " + matricula + ", " + serie + "\n";
        String printNotasTrabalhos = "";
        for (double notaTrabalho : notasTrabalhos) {
            printNotasTrabalhos += notaTrabalho + ", ";
        }

        return dadosCadastrais + printNotasTrabalhos;
    }

    /**
     * Atributos do objeto
     */
    private String nome;
    private String matricula;
    private int serie;

    private double[] notasTrabalhos;
    private double[] notasBimestrais = new double[4];
    private double notaExame;
}