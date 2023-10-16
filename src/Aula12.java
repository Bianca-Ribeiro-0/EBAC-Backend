import java.util.*;

public class Aula12 {
    public static void main(String args[]) {
        pessoasNomes();
        System.out.println(" ");
        pessoasNomeseGeneros();
    }

    private static void pessoasNomes() {
        System.out.println("Primeira parte");

        Scanner s = new Scanner(System.in);
        Map<String, String> nomes = new HashMap<>();

        //enquanto o usuario desejar digitar os nomes será executado
        while (true) {
            System.out.println("Digite um nome ou 'sair' para encerrar: ");
            String nome = s.nextLine();

            //Caso deseja sair, pare a aplicação
            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            //nomes inseridos ficarão na lista de nomes
            nomes.put(nome, "Inserido");
        }

        //Imprime as chaves do map separados por virgula
        System.out.println("Nomes inseridos:");
        for (String nome : nomes.keySet()) {
            System.out.print(nome + ", ");
        }
    }

    private static void pessoasNomeseGeneros() {
        Scanner s = new Scanner(System.in);

        //adicionando um map com dois grupos de sexos
        Map<String, List<String>> generos = new HashMap<>();
        generos.put("feminino", new ArrayList<>());
        generos.put("masculino", new ArrayList<>());

        while (true) {
            System.out.println("Digite o nome (ou digite 'sair' para encerrar): ");
            String nome = s.nextLine();

            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.println("Digite o sexo (feminino ou masculino): ");
            String genero = s.nextLine();

            //caso o genero digitado contem no grupo, será adicionado
            if (generos.containsKey(genero)) {
                generos.get(genero).add(nome + " - " + genero);
            } else {
                System.out.println("Sexo inválido. Use 'feminino' ou 'masculino'.");
            }
        }

        System.out.println("Lista de nomes femininos: " + generos.get("feminino"));
        System.out.println("Lista de nomes masculinos: " + generos.get("masculino"));
    }

    }


