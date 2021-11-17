package lista.semana1.registros;

import java.util.Date;

public class Livro {
    private String titulo;
    private Autor autor;
    private Editora editora;
    private int volume;
    private int edicao;
    private int ano;
    private Isbn isbn;
    private String classificacao;
    private String sku;
    private String nacionalidade;

    public Autor getAutor() {
        return this.autor;
    }
}

class Autor {
    private String nome;
    private String sobrenome;
    private Date nascimento;
    private Date morte;
}

class Editora {
    private String nome;
    private String cnpj;
    private String enderecoSede;
}

class Isbn {
    String isbn;

    // Método construtor
    private Isbn(String isbn) {
        this.isbn = isbn;
    }

    // Método factory
    public static Isbn criarIsbnValido(String novoIsbn) {
        if (isIsbnValido(novoIsbn)) {
            return new Isbn(novoIsbn);
        } else {
            //throw new IsbnInvalidoException("O novo ISBN não é um número válido.");
            throw new RuntimeException("O novo ISBN não é um número válido.");
        }
    }

    private static boolean isIsbnValido(String novoIsbn) {
        throw new RuntimeException("Método ainda não implementado");
    }

    public String getIsbn() {
        return this.isbn;
    }

    public String toString() {
        return this.isbn;
    }
}