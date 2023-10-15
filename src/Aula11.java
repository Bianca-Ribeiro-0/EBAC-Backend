import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aula11 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        //Criando uma lista separando os sexos
        List<String> feminino = new ArrayList<>();
        List<String> masculino = new ArrayList<>();

        //criando um looping para ir adicionando a lista
        while (true) {
            System.out.println("Digite o nome (ou digite 'sair' para encerrar): ");
            String nome = s.next();

            if (nome.equalsIgnoreCase("sair")) {
                break; // Se o usuário digitar sair, o loop é encerrado.
            }

            System.out.println("Digite o sexo (feminino ou masculino): ");
            String sexo = s.next();

            //condições para adicionar caso a lista ja definida
            if (sexo.equalsIgnoreCase("feminino")) {
                feminino.add(nome);
            } else if (sexo.equalsIgnoreCase("masculino")) {
                masculino.add(nome);
            } else {
                System.out.println("Sexo inválido. Use 'feminino' ou 'masculino'.");
            }
        }

        //Após digitar em sair ele irá imprimir tudo que foi adicionado à lista
        System.out.println("Lista de nomes femininos: " + feminino);
        System.out.println("Lista de nomes masculinos: " + masculino);
    }
}
