public class Main {
    public static void main(String[] args) {
    
        Carro carro1 = new Carro();
        carro1.setNomeModelo("Fastback");
        int anoModelo = carro1.setAnoModelo(2024);
        String fabricante = carro1.setFabricante("Fiat");
        String corVeiculo = carro1.setCorVeiculo("Cinza Silverstone");
        double valor = carro1.setValor(150000.00);

        String carroLigado = carro1.ligarCarro();
        System.out.println(carroLigado.toString());

        System.out.println("Nome: " + carro1.getNomeModelo());

        /* Posso fazer a impressão dos valores do objeto Carro1 de duas maneiras,
        da maneira da impressão acima, usando o GET, ou imprimindo a variável
        onde está contido o SET utilizado para adicionar valor à variável
        (anoModelo por exemplo), como está na impressão abaixo. */

        System.out.println("Ano: " + anoModelo);
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Cor: " + corVeiculo);
        System.out.println("Valor: " + valor);
    }
}
