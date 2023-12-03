package br.main.testes;

import br.main.streams.Pessoa;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.stream.Collectors;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Testes {

    @Test
    public void testFiltrarNomesFemininos() {
        List<Pessoa> lista = Pessoa.populaPessoas();

        List<Pessoa> mulheres = lista.stream()
                .filter(p -> "Feminino".equals(p.getSexo()))
                .collect(Collectors.toList());

        for (Pessoa mulher : mulheres) {
            assertEquals("Feminino", mulher.getSexo());
        }
    }
}
