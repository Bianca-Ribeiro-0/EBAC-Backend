public class Programa {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        PessoaFisica pessoaFisica = new PessoaFisica();
        PessoaJuridica pessoaJuridica = new PessoaJuridica();

        
        pessoaFisica.setNome("Maria");
        pessoaFisica.setCpf("123456789");

        pessoaJuridica.setNome("Empresa do fulano");
        pessoaJuridica.setCnpj("29292929293");


        System.out.println("Nome: " + pessoa.getNome());

        System.out.println("Nome: " + pessoaFisica.getNome() + "CPF: " + pessoaFisica.getCpf());

        System.out.println("Nome: " + pessoaJuridica.getNome() + "CNPJ: " + pessoaJuridica.getCnpj());
    }
}

