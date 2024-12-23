public class Cliente {
    private String escolha;
    private Boolean possuiContrato;

    public Cliente (String escolha, Boolean possuiContrato){
        this.escolha = escolha;
        this.possuiContrato = possuiContrato;
    }

    public String escolha(){
        return escolha;
    }
    public Boolean possuiContrato(){
        return possuiContrato;
    }
}
