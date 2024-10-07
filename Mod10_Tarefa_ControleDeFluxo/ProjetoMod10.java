import java.util.Scanner;
public class ProjetoMod10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Olá, tudo bem? \nDigite ao lado a sua primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.print("Sua segunda nota: ");
        double nota2 = sc.nextDouble();
        System.out.print("A sua terceira nota: ");
        double nota3 = sc.nextDouble();
        System.out.print("E para finalizar, a quarta nota: ");
        double nota4 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media >= 7) {
            System.out.println("Parabéns! Você foi aprovado(a)!");
        } else if (media >= 5) {
            System.out.println("Você ficou de recuperação!");
        } else {
            System.out.println("Você foi reprovado(a)!");
        }
    }
}
