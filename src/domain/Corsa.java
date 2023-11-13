package domain;

import domain.Carro;

public class Corsa <T> extends Carro<T> {
    public Corsa(T marca, T preco, T cor, T ano, T modelo) {
        super(marca, preco, cor, ano, modelo);
    }

    @Override
    public void InfoCarro() {
        System.out.println("Carro Corsa - Modelo: " + getModelo());
    }
}