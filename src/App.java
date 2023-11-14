public class App {

    public static void main(String[] args) {

        InformacaoPessoa infoPessoa = Pessoa.class.getAnnotation(InformacaoPessoa.class);


        if (infoPessoa != null) {
            // Imprimindo informações da pessoa
            System.out.println("Nome: " + infoPessoa.nome());
            System.out.println("Idade: " + infoPessoa.idade());
            System.out.println("Cidade: " + infoPessoa.cidade());
        } else {
            System.out.println("A anotação InformacaoPessoa não está presente.");
        }
    }
}