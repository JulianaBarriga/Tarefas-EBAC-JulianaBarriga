public class PessoaFisica extends Pessoas{

    @Override
    public void impostos() {
        System.out.println("\nEstas são as regras para Declaração de Imposto de Renda de Pessoa Física:");
        System.out.println("- Declara somente quem teve rendimento anual tributável superior ao teto estabelecido pela RF, que em 2024 corresponde a uma remuneração mensal R$2.824,00 (2 salários mínimos).");
        System.out.println("Para mais informações acesse: https://www.gov.br/receitafederal/pt-br/assuntos/meu-imposto-de-renda/quem");
    }

    public static void cadastrarPF(String nome, Long identificacao, Double patrimonio, Long contato){
        PessoaFisica pessoas = new PessoaFisica();
        pessoas.setNome(nome);
        pessoas.setIdentificacao(identificacao);
        pessoas.setPatrimonio(patrimonio);
        pessoas.setContato(contato);

        System.out.println("Dados cadastrados!");
        System.out.println("Nome: " + pessoas.getNome() + ", CPF: " + pessoas.getIdentificacao() + ", Patrimônio: R$" + pessoas.getPatrimonio() + ", Contato: " + pessoas.getContato());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
