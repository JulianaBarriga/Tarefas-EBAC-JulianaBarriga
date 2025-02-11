public class NissanVersa extends Carro{

    public NissanVersa(String codigo, String nome, String cor, String valor, String cavalosDePotencia) {
        super(Long.parseLong(codigo), nome, cor, Double.parseDouble(valor), Integer.parseInt(cavalosDePotencia));
    }

}
