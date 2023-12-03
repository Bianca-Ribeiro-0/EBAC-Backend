package br.main.streams;

import java.util.List;

public class Ex22 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        List<Pessoa> lista = pessoa.populaPessoas();

        lista.stream()
                .filter(p -> "Feminino".equals(p.getSexo()))
                .forEach(System.out::println);
    }
}
