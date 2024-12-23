public abstract class Carro {
    private Integer cavalosdePotencia;
    private String gasolinaNoTanque;
    private String cor;

    public Carro(Integer cavalosdePotencia, String gasolinaNoTanque, String cor){
        this.cavalosdePotencia = cavalosdePotencia;
        this.gasolinaNoTanque = gasolinaNoTanque;
        this.cor = cor;
    }

    public void motorLigado(){
        System.out.println(getClass().getSimpleName());
        System.out.println("Status: " + "Carro ligado, confirmação de tanque com " + gasolinaNoTanque + "% de " +
                "gasolina. Disponível para utilizar os " + cavalosdePotencia + " cavalos de potência.");
    }
    public void carroLimpo(){
        System.out.println("Status: " + "Carro selecionado na cor " + cor + ", que está brilhando após limpeza!");
    }
    public void check(){
        System.out.println("Status: " + "Carro conferido e liberado pela mecânica, pronto para uso.");
    }
}
