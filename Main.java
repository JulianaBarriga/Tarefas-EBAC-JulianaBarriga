public class Main {
    public static void main(String[] args) {
    Tabelas nvTabItau = new Tabelas("Itaú");

    Class<Tabelas> classe = Tabelas.class;
        if(classe.isAnnotationPresent(Tabela.class)){
            Tabela tabela = classe.getAnnotation(Tabela.class);

            System.out.println("Nome da Tabela: " + tabela.tipoTabela() + nvTabItau.nome);
        }

    }
}