/// @author juliana.barriga
public class Carro {

    private String corVeiculo;
    private int aroPneu;
    private int quantPortas;

    private String fabricante;
    private String nomeModelo;
    private String tipocarroceria;
    private int anoModelo;

    private double valor;
    private String formaDePagamento;
    private int desconto;


    /*
    * O método GET é utilizado para acessar o valor das variáveis que estão com acesso private,
    * enquanto o método SET é utilizado para alterar/adicionar esses valores.
    */
    public String getCorVeiculo() {
        return corVeiculo;
    }
    public String setCorVeiculo(String corVeiculo) {
        return this.corVeiculo = corVeiculo;
    }

    public int getAroPneu() {
        return aroPneu;
    }
    public int setAroPneu(int aroPneu) {
        return this.aroPneu = aroPneu;
    }

    public int getQuantPortas() {
        return quantPortas;
    }
    public int setQuantPortas(int quantPortas) {
        return this.quantPortas = quantPortas;
    }

    public String getFabricante() {
        return fabricante;
    }
    public String setFabricante(String fabricante) {
        return this.fabricante = fabricante;
    }

    public String getNomeModelo() {
        return nomeModelo;
    }
    public String setNomeModelo(String nomeModelo) {
        return this.nomeModelo = nomeModelo;
    }

    public String getTipocarroceria() {
        return tipocarroceria;
    }
    public String setTipocarroceria(String tipocarroceria) {
        return this.tipocarroceria = tipocarroceria;
    }

    public int getAnoModelo() {
        return anoModelo;
    }
    public int setAnoModelo(int anoModelo) {
        return this.anoModelo = anoModelo;
    }

    public double getValor() {
        return valor;
    }
    public double setValor(double valor) {
        return this.valor = valor;
    }

    public String getFormaDePagamento() {
        return formaDePagamento;
    }
    public String setFormaDePagamento(String formaDePagamento) {
        return this.formaDePagamento = formaDePagamento;
    }

    public int getDesconto() {
        return desconto;
    }
    public int setDesconto(int desconto) {
        return this.desconto = desconto;
    }

    String ligarCarro(){
        return "Vrum Vrum!";
    }
}
