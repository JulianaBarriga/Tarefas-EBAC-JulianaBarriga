public class PessoaJuridica extends Pessoas{
    @Override
    public void impostos() {
        System.out.println("\nEstas são as regras para Declaração de Imposto de Renda de Pessoa Jurídica:");
        System.out.println("- O Governo Federal determina quais empresas estão obrigadas a pagarem o IRPJ, sendo elas: as pessoas jurídicas e as empresas individuais.");
        System.out.println("Para mais informações acesse: https://blog.cielo.com.br/dicas-e-historias-de-sucesso/como-declarar-imposto-de-renda-pj/");
    }

    private String nomeFantasia;

    public String getNomeFantasia() {
        return nomeFantasia;
    }
    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public static void cadastrarPJ(String nomeFantasia, String nome, Long identificacao, Double patrimonio, Long contato){
        PessoaJuridica pessoas = new PessoaJuridica();
        pessoas.setNomeFantasia(nomeFantasia);
        pessoas.setNome(nome);
        pessoas.setIdentificacao(identificacao);
        pessoas.setPatrimonio(patrimonio);
        pessoas.setContato(contato);

        System.out.println("Dados cadastrados!");
        System.out.println("Nome Fantasia: " + pessoas.getNomeFantasia() + ", Razão social: " + pessoas.getNome() + ", CNPJ: " + pessoas.getIdentificacao() + ", Patrimônio: R$" + pessoas.getPatrimonio() + ", Contato: " + pessoas.getContato());

    }
}
