import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ProjetoMod11 {
    public static void main(String[] args) {
        //parte1();
        //parte2();
    }

    private static void parte1(){
        System.out.println("****** Exercício Parte1 ******\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva abaixo os nomes que deseja, separados por vígulas e espaço: ");
        String nomes = sc.nextLine(); 
        // Sugestão: Laura, Roberto, Felipe, Isaque, Cecilia, Lucas, Mara, Ana, Isabela

        String[] nomesatt = nomes.split(", ");

        List<String> listaNomes = new ArrayList<>();
        for (String nome : nomesatt) {
            listaNomes.add(nome);
        }
        Collections.sort(listaNomes);
        System.out.println("\nEstes são os nomes em ordem alfabética: " + listaNomes);
        System.out.println("\n");
    }

    private static void parte2(){
        System.out.println("****** Exercício Parte2 ******\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Maria-F, Lucas-M");
        System.out.println("Escreva abaixo o nome e o sexo das pessoas, exatamente como no exemplo acima: ");
        String nomes = sc.nextLine();

        String[] nomesatt = nomes.split(", ");
        
        List<String> listaNomes = new ArrayList<>();
        List<String> listaHomens = new ArrayList<>();
        List<String> listaMulheres = new ArrayList<>();
        List<String> listadeIncorr = new ArrayList<>();
        for (String nome : nomesatt) {
            listaNomes.add(nome);
            if(nome.contains("-M")){
                listaHomens.add(nome);
            } else if(nome.contains("-F")){
                listaMulheres.add(nome);
            } else{
                listadeIncorr.add(nome);
            }
        }
        
        System.out.println("\n");
        System.out.println("Lista completa: " + listaNomes);
        System.out.println("Lista de homens: " + listaHomens);
        System.out.println("Lista de mulheres: " + listaMulheres);
        System.out.println("Gênero não identificado: " + listadeIncorr);
        System.out.println("\n");

        /* Se puder me dar um retorno de como eu posso prosseguir sem imprimir o gênero
        após o nome, eu agradeço, consegui prosseguir somente dessa forma. 
        Na plataforma, a orientação é usar a estrutura Map<String,List<String>>, mas não entendi
        como eu poderia prosseguir desta forma.*/
    }
}
