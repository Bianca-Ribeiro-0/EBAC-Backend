package domain;

public class Renault<T> extends Carro<T> {

    public Renault(T marca, T preco, T cor, T ano, T modelo) {
        super(marca, preco, cor, ano, modelo);
    }

    @Override
    public void InfoCarro() {
        System.out.println("Carro Renault - Modelo: " + getModelo());
    }
}