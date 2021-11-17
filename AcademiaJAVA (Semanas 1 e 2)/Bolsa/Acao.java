public class Acao {

    // Construtores
    // Construtor padrão, no caso, só será invocável neste próprio código,
    // por ser "private".
    private Acao() {
        this("BMFBovespa", "198237291387/12983-01", 
            35_000_000, SegmentoMercado.NOVO_MERCADO, "B3SA3");
    }

    // Construtor completo
    public Acao(String razaoSocial, String cnpj, long qtdeCotas,
            SegmentoMercado segmentoMercado, String ticker) {
        
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.qtdeCotas = qtdeCotas;
        this.segmentoMercado = segmentoMercado;
        this.ticker = ticker;
        this.valorCota = 0.0;
    }

    // Acessores computados
    public double getValorMercado() {
        return this.valorCota * this.qtdeCotas;
    }

    //--------
    // Acessores armazenados
    //--------
    public void setValorCota(double novoValorCota) {
        this.valorCota = novoValorCota;
    }

    /**
     * Acessa a quantidade de cotas públicas emitidas para esta ação.
     * @return Quantidade de contas em unidades de cotas.
     */
    public long getQtdeCotas() {
        return this.qtdeCotas;
    }

    public double getValorCota() {
        return this.valorCota;
    }

    public String getTicker() {
        return this.ticker;

        // Eu poderia querer mudar a forma de consultar ticker, como abaixo.
        //return BMFBovespa.consultarTicker(this.cnpj);
    }

    public SegmentoMercado getSegmentoMercado() {
		return this.segmentoMercado;
	}

    // Atributos (campos, field do inglês)
    private String razaoSocial; // null
    private String cnpj; // null
    private long qtdeCotas; // 0
    private SegmentoMercado segmentoMercado; // null
    private String ticker; // null
    private double valorCota;
    // Os comentários a frente exibem os valores padrão para cada atributos que
    // não for inicializado.
}
