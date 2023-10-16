import java.util.*;

public class Aula12 {
    public static void main(String args[]) {
        exemploListaSimples();
        exemploIterandoValores();
    }

    private static void exemploIterandoValores() {
        Map<Integer, String> lista = new HashMap<>();
        lista.put(1, "bia");
        lista.put(2, "Leo");

        Set<Map.Entry<Integer, String>> entry = lista.entrySet();
            lista.entrySet().forEach(e -> {
            System.out.println("Chave: " + e.getKey());
            System.out.println("Valor: " +e.getValue());
        });


    }

    private static void exemploListaSimples() {
        Map<Integer, String> lista = new HashMap<>();
        lista.put(1, "Bia");
        lista.put(2, "Joao");
        lista.put(3, "Leo");

        System.out.println(lista);
    }
}
