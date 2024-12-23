public abstract class Factory {
    public Carro criar(String escolha) {
        Carro carro = retorneCarro(escolha);
        carro = prepararCarro(carro);
        return carro;
    }

    private Carro prepararCarro(Carro carro) {
        carro.carroLimpo();
        carro.check();
        carro.motorLigado();
        return carro;
    }

    abstract Carro retorneCarro(String escolha);

}
