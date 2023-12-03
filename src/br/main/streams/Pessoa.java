package br.main.streams;

import java.util.List;

public class Pessoa {
    private String nome;
    private String sexo;

    public Pessoa() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Pessoa(String nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public static List<Pessoa> populaPessoas() {
        Pessoa pessoa1 = new Pessoa("Matheus Henrique", "Masculino");
        Pessoa pessoa2 = new Pessoa("Matheus", "Masculino");
        Pessoa pessoa3 = new Pessoa("Ana Maria", "Feminino");
        Pessoa pessoa4 = new Pessoa("Amanda", "Feminino");
        return List.of(pessoa1, pessoa2, pessoa3, pessoa4);
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}
