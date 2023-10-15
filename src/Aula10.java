import java.util.Scanner;

public class Aula10 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        System.out.println("Digite sua primeira nota: ");
        int nota1 = s.nextInt();

        System.out.println("Digite sua segunda nota: ");
        int nota2 = s.nextInt();

        System.out.println("Digite sua terceira nota: ");
        int nota3 = s.nextInt();

        System.out.println("Digite sua quarta nota: ");
        int nota4 = s.nextInt();

        int estaAprovado = (nota1 + nota2 + nota3 + nota4 )/ 4;

        if (estaAprovado >= 7){
            System.out.println("Está aprovado!");
        } else if (estaAprovado >= 5) {
            System.out.println("Está de recuperação");
        } else {
            System.out.println("Está reprovado");
        }
    }
}
