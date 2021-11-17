public class PreExameAdmissao {
    public static void main(String... args) {
        Imc resultado = consultarDiagnosticoImc(35.0);
        System.out.println("Esperado Obesidade, obtive " + resultado.getEscrita());
    }

    private static Imc consultarDiagnosticoImc(double indiceImc) {
        /* if é "se" em inglês
        if (expr_predicado) { // Expressão predicado é uma expressão lógica, ou booleana.
            // Bloco de código (ou roteiro de sentenças), só vai ser computado se
            // expr_predicado for true
        } else {
            // Bloco de código, só vai se computador se expr_predicado for false
        }*/
        Imc diagnostico;

        // Se IMC < 18.5 então
        if (indiceImc < 18.5) {
            diagnostico = Imc.SUBNITRICAO;
        
        // Se 18.5 <= IMC < 25 então
        } else if (18.5 <= indiceImc && indiceImc < 25) {
            diagnostico = Imc.NORMAL;
        
        // Se 25 <= IMC < 30 então
        } else if (25 <= indiceImc && indiceImc < 30) {
            diagnostico = Imc.SOBREPESO;
        
        // Se IMC >= 30 então
        } else { 
            diagnostico = Imc.OBESIDADE;
        }

        return diagnostico;

        /**
            indiceImc: 21

            18.5 <= indiceImc && indiceImc < 25
            18.5 <= 21 && indiceImc < 25
            true && indiceImc < 25
            true && 21 < 25
            true && true
            true


            indiceImc: 25

            18.5 <= indiceImc && indiceImc < 25
            18.5 <= 25 && indiceImc < 25
            true && indiceImc < 25
            true && 25 < 25
            true && false
            false
         */
    }

    /**
     * Calcula o IMC, com base na literatura médica, peso / altura^2.
     * @param peso Seu peso em kg.
     * @param altura Sua altura em metros.
     * @return Índice IMC com base na literatura.
     */
    private static double calcularImc(double peso, double altura) {
        return peso / Math.pow(altura, 2);
    }
}