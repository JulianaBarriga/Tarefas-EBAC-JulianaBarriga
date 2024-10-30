public abstract class Pessoas {
    private String nome;
    private Long identificacao;
    private Double patrimonio;
    private Long contato;

    public abstract void impostos();

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Long getIdentificacao() {
        return identificacao;
    }
    public void setIdentificacao(Long identificacao) {
        this.identificacao = identificacao;
    }
    public Double getPatrimonio() {
        return patrimonio;
    }
    public void setPatrimonio(Double patrimonio) {
        this.patrimonio = patrimonio;
    }
    public Long getContato() {
        return contato;
    }
    public void setContato(Long contato) {
        this.contato = contato;
    }

}
