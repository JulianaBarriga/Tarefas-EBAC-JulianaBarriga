import dao.IUsuarioDAO;
import dao.UsuarioMapDAO;
import dao.UsuarioSetDAO;
import domain.Usuario;

import javax.swing.*;

public class MainProj1 {
    private static IUsuarioDAO iUsuarioDAO;
    public static void main(String[] args) {
        iUsuarioDAO = new UsuarioMapDAO();

        JOptionPane.showMessageDialog(null,"Seja bem vindo(a) à nossa Clínica Veterinária. Clique em OK para prosseguir.","Seja bem vindo(a)!",JOptionPane.INFORMATION_MESSAGE);
        String opcao = JOptionPane.showInputDialog(null, "Digite a opção desejada: \n" +
                "1 - Cadastrar Novo Paciente \n" +
                "2 - Consultar Cadastro \n" +
                "3 - Excluir Cadastro \n" +
                "4 - Alterar Cadastro \n" +
                "5 - Sair", "Menu Inicial", JOptionPane.INFORMATION_MESSAGE);

        while (!isOpcaoValida(opcao)){
            if(opcao.equals("")){
                sair();
            } opcao = JOptionPane.showInputDialog(null,
                    "Opção Inválida! Digite a opção desejada: \n" +
                            "1 - Cadastrar Novo Paciente \n" +
                            "2 - Consultar Cadastro \n" +
                            "3 - Excluir Cadastro \n" +
                            "4 - Alterar Cadastro \n" +
                            "5 - Sair",
                    "Opção Inválida! Tente novamente.",JOptionPane.INFORMATION_MESSAGE);
        }
        while (isOpcaoValida(opcao)){
            if(isOpcaoSair(opcao)){
                sair();
            } else if (isOpcaoCadastrar(opcao)){
                String dados = JOptionPane.showInputDialog(null,
                        "Digite os dados do cliente separados por vírgula e espaço:\n"
                                + "Informe somente os dados, sem casa decimal ou parênteses.\n" +
                                "Exemplo: Código, Nome, Peso, Cor, Gênero, Idade, Telefone, Nome do Dono.", "Alteração de Dados", JOptionPane.INFORMATION_MESSAGE);
                cadastrar(dados);
            } else if (isOpcaoConsultar(opcao)){
                String dados = JOptionPane.showInputDialog(null, "Digite o código do Paciente:", "Consultar", JOptionPane.INFORMATION_MESSAGE);
                consultar(dados);
            } else if (isOpcaoExcluir(opcao)){
                String dados = JOptionPane.showInputDialog(null, "Digite o código do Paciente:", "Excluir", JOptionPane.INFORMATION_MESSAGE);
                excluir(dados);
            } else if(isOpcaoAlterar(opcao)){
                String dados = JOptionPane.showInputDialog(null, "Digite o código do Paciente:", "Alteração", JOptionPane.INFORMATION_MESSAGE);
                alterar(dados);
            }
            opcao = JOptionPane.showInputDialog(null, "Digite a opção desejada: \n" +
                    "1 - Cadastrar Novo Paciente \n" +
                    "2 - Consultar Cadastro \n" +
                    "3 - Excluir Cadastro \n" +
                    "4 - Alterar Cadastro \n" +
                    "5 - Sair", "Menu Inicial", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static  boolean isOpcaoCadastrar(String opcao){
        if (opcao.equals("1")){
            return true;
        } return false;
    }
    private static  boolean isOpcaoConsultar(String opcao){
        if (opcao.equals("2")){
            return true;
        } return false;
    }
    private static  boolean isOpcaoExcluir(String opcao){
        if (opcao.equals("3")){
            return true;
        } return false;
    }
    private static  boolean isOpcaoAlterar(String opcao){
        if (opcao.equals("4")){
            return true;
        } return false;
    }
    private static  boolean isOpcaoSair(String opcao){
        if (opcao.equals("5")){
            return true;
        } return false;
    }

    private static void cadastrar(String dados){
        String[] dadosSeparados = dados.split(", ");
        Usuario usuario = new Usuario(dadosSeparados[0],dadosSeparados[1],dadosSeparados[2],
                dadosSeparados[3],dadosSeparados[4],dadosSeparados[5],
                dadosSeparados[6],dadosSeparados[7]);
        Boolean iscadastrado = iUsuarioDAO.cadastrar(usuario);
        if(iscadastrado){
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!", "Cadastro realizado", JOptionPane.INFORMATION_MESSAGE);
        } else{
            JOptionPane.showMessageDialog(null, "Cliente já se encontra cadastrado!", "Cadastro encontrado", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    private static void consultar(String dados){
        Usuario usuario = iUsuarioDAO.consultar(Long.parseLong(dados));
        if (usuario != null){
            JOptionPane.showMessageDialog(null, "Cliente encontrado: " + usuario.toString(), "Consulta", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado", "Consulta ERRO", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    private static void excluir(String dados){
        iUsuarioDAO.excluir(Long.parseLong(dados));
        JOptionPane.showMessageDialog(null, "Exclusão realizada!", "Cadastro Excluído", JOptionPane.INFORMATION_MESSAGE);
    }
    private static void alterar(String dados){
        Usuario usuario = iUsuarioDAO.consultar(Long.parseLong(dados));
        iUsuarioDAO.alterar(usuario);
        String dadoss = JOptionPane.showInputDialog(null, "Digite os dados do cliente separados por vírgula e espaço:\n"
                + "Informe somente os dados, sem casa decimal ou parênteses.\n" +
                "Exemplo: Código, Nome, Peso, Cor, Gênero, Idade, Telefone, Nome do Dono.", "Alteração de Dados", JOptionPane.INFORMATION_MESSAGE);
        atualizar(dadoss);
    }
    private static void atualizar(String dados){
        String[] dadosSeparados = dados.split(", ");
        Usuario usuario = new Usuario(dadosSeparados[0],dadosSeparados[1],dadosSeparados[2],
                dadosSeparados[3],dadosSeparados[4],dadosSeparados[5],
                dadosSeparados[6],dadosSeparados[7]);
        iUsuarioDAO.alterar(usuario);
        JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!", "Alteração finalizada", JOptionPane.INFORMATION_MESSAGE);

    }
    private static void sair() {
        JOptionPane.showMessageDialog(null, "Até logo =)", "SAIR", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
    private static boolean isOpcaoValida(String opcao) {
        if (opcao.contains("1") || opcao.contains("2") || opcao.contains("3")
                || opcao.contains("4") || opcao.contains("5")){
            return true;
        } return false;
    }
}
