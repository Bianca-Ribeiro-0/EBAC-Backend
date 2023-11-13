package domain;

public class HB20 <T> extends Carro<T>{
    public HB20(T marca, T preco, T cor, T ano, T modelo) {
        super(marca, preco, cor, ano, modelo);
    }

    @Override
    public void InfoCarro() {
        System.out.println("Carro HB20 - Modelo: " + getModelo());
    }
}