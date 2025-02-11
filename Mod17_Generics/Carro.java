import java.util.*;

public abstract class Carro implements ICarro{

    protected String nome;
    public Long codigo;
    protected String cor;
    protected double valor;
    protected int cavalosDePotencia;

    private Map<Long, Carro> listaCarros = new HashMap<>();

    public Carro(Long codigo, String nome, String cor, double valor, int cavalosDePotencia) {
        this.nome = nome;
        this.codigo = codigo;
        this.cor = cor;
        this.valor = valor;
        this.cavalosDePotencia = cavalosDePotencia;
    }

    @Override
    public Boolean cadastrar(Carro carro) {
        if(this.listaCarros.containsKey(carro.getCodigo())){
            return false;
        } else{
            this.listaCarros.put(carro.getCodigo(), carro);
            return true;
        }
    }
    public Carro consultar(Long codigo) {
        return this.listaCarros.get(codigo);
    }

    public String getNome() {
        return nome;
    }

    public Long getCodigo() {
        return codigo;
    }

    public String getCor() {
        return cor;
    }

    public double getValor() {
        return valor;
    }

    public int getCavalosDePotencia() {
        return cavalosDePotencia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return Double.compare(valor, carro.valor) == 0 && cavalosDePotencia == carro.cavalosDePotencia && Objects.equals(nome, carro.nome) && Objects.equals(codigo, carro.codigo) && Objects.equals(cor, carro.cor) && Objects.equals(listaCarros, carro.listaCarros);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, codigo, cor, valor, cavalosDePotencia, listaCarros);
    }

    @Override
    public String toString() {
        return "Modelo " + getClass().getSimpleName() + " \n" +
                "Código: " + codigo +
                ", nome: " + nome +
                ", cor: " + cor +
                ", valor: R$" + valor +
                "0, cavalos de potencia: " + cavalosDePotencia +
                ".";
    }

}
