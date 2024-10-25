import java.util.HashMap;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ProjetoMod12 {
    public static void main(String[] args) {
        proj2();
    }
    public static void proj2(){

        System.out.println("****** Projeto Módulo 12 ******\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Clara-F, João-M");
        System.out.print("Escreva ao lado o nome e o gênero das pessoas, como no exemplo acima: ");
        String nomepessoas = sc.nextLine();
        String[] nomes = nomepessoas.split(", ");

        // Chave String, Valor lista
        Map<String, List<String>> classes = new HashMap<>();
        classes.put("Masculino", new ArrayList<>());
        classes.put("Feminino", new ArrayList<>());
        classes.put("Gênero incorreto", new ArrayList<>());

        // endsWith() indica se uma string termina com determinados caracteres...
        for (String nome : nomes) {
        if (nome.endsWith("-M")) {
            classes.get("Masculino").add(nome.replace("-M", ""));
            // acima, em add. estamos adicionando os nomes que terminam com -Me ao mesmo tempo
            // estamos substituindo o -M por nada.
            } else if (nome.endsWith("-F")) {
                classes.get("Feminino").add(nome.replace("-F", ""));
            } else {
                classes.get("Gênero incorreto").add(nome);
            }
        }

        // O Arrays.toString retorna uma representação de string do conteúdo do array especificado.
        System.out.println("\nLista completa: " + Arrays.toString(nomes));
        System.out.println("Lista de homens: " + classes.get("Masculino"));
        System.out.println("Lista de mulheres: " + classes.get("Feminino"));
        System.out.println("Gênero incorreto: " + classes.get("Gênero incorreto"));
    }
}
