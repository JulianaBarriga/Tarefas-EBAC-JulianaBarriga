import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
        int idade;
        System.out.println("Por gentileza, informe sua idade:");
        idade = info.nextInt();

        Long idadeC = (long) idade;
        System.out.println("Idade: " + idadeC + ", cadastrada!");
        info.close();
    }
}
