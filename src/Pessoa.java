public class Pessoa {
    private String nome;
    private String CPF;
    private String endereco;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    /**
     * Fala uma mensagem específica.
     * @param falar A mensagem a ser falada.
     */
    public void Falar(String falar) {
        System.out.println(falar);
    }

}
