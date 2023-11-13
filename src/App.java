import domain.Carro;
import domain.Corsa;
import domain.HB20;
import domain.Renault;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // Criando uma lista de carros usando generics
        List<Carro<String>> listaCarros = new ArrayList<>();

        // Adicionando carros à lista
        listaCarros.add(new Renault<>("Renault", "PrecoRenault", "CorRenault", "AnoRenault", "Clio"));
        listaCarros.add(new HB20<>("HB20", "PrecoHB20", "CorHB20", "AnoHB20", "Comfort"));
        listaCarros.add(new Corsa<>("Corsa", "PrecoCorsa", "CorCorsa", "AnoCorsa", "Sedan"));

        // Exibindo informações de todos os carros na lista
        for (Carro<String> carro : listaCarros) {
            carro.InfoCarro();
        }
    }
}
