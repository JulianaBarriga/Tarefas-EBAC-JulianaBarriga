import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Seja bem vindo(a)!");
        System.out.println("Abaixo, digite 1 para cadastrar Pessoa Física ou 2 para cadastrar Pessoa Jurídica: ");
        int resposta = sc.nextInt();

        if (resposta == 1) {
            pessoasfisicas();
        } else if (resposta == 2) {
            pessoasjuridicas();
        } else {
            System.out.println("Resposta inválida! Tente novamente.");
        }
    }

    public static void pessoasfisicas() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o Nome:");
        String nome = sc.nextLine();
        System.out.println("Digite o CPF (somente números):");
        Long cpf = sc.nextLong();
        System.out.println("Digite o Patrimônio (sem casa decimal):");
        Double patrimonio = sc.nextDouble();
        System.out.println("E por último, o Contato (somente números):");
        Long contato = sc.nextLong();

        PessoaFisica.cadastrarPF(nome, cpf, patrimonio, contato);

        impostoPF();
    }

    private static void impostoPF() {
        Scanner sc = new Scanner(System.in);
        Pessoas novoCad = new PessoaFisica();

        System.out.println("\nDeseja verificar as informações referente ao pagamento de imposto para PF?");
        String resp = sc.nextLine();
        if (resp.equalsIgnoreCase("Sim")) {
            novoCad.impostos();
        } else {
            System.out.println("Processo finalizado!");
        }
        System.out.println("Agradecemos por sua participação! =)");
    }

    public static void pessoasjuridicas() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o Nome fantasia:");
        String nomeFantasia = sc.nextLine();
        System.out.println("Digite a Razão Social:");
        String razaoSocial = sc.nextLine();
        System.out.println("Digite o CNPJ (somente números):");
        Long cnpj = sc.nextLong();
        System.out.println("Digite o Patrimônio (sem casa decimal):");
        Double patrimonio = sc.nextDouble();
        System.out.println("E por último, o Contato  (somente números):");
        Long contato = sc.nextLong();

        PessoaJuridica.cadastrarPJ(nomeFantasia, razaoSocial, cnpj, patrimonio, contato);

        impostoPJ();
    }

    private static void impostoPJ() {
        Scanner sc = new Scanner(System.in);
        Pessoas novoCad = new PessoaJuridica();

        System.out.println("\nDeseja verificar as informações referente ao pagamento de imposto para PJ?");
        String resp = sc.nextLine();
        if (resp.equalsIgnoreCase("Sim")) {
            novoCad.impostos();
        } else {
            System.out.println("Processo finalizado!");
        }
        System.out.println("Agradecemos por sua participação! =)");
    }
}
