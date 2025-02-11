public class SW4 extends Carro{

    public SW4(String codigo, String nome, String cor, String valor, String cavalosDePotencia) {
        super(Long.parseLong(codigo), nome, cor, Double.parseDouble(valor), Integer.parseInt(cavalosDePotencia));
    }

}
