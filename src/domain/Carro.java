package domain;

public abstract class Carro<T> {

    private T marca;
    private T preco;
    private T cor;
    private T ano;
    private T modelo;

    public Carro(T marca, T preco, T cor, T ano, T modelo) {
        this.marca = marca;
        this.preco = preco;
        this.cor = cor;
        this.ano = ano;
        this.modelo = modelo;
    }

    public void InfoCarro(){
        System.out.println("Carro HB20 - Modelo: " + getModelo());
    }

    public T getMarca() {
        return marca;
    }

    public void setMarca(T marca) {
        this.marca = marca;
    }

    public T getPreco() {
        return preco;
    }

    public void setPreco(T preco) {
        this.preco = preco;
    }

    public T getCor() {
        return cor;
    }

    public void setCor(T cor) {
        this.cor = cor;
    }

    public T getAno() {
        return ano;
    }

    public void setAno(T ano) {
        this.ano = ano;
    }

    public T getModelo() {
        return modelo;
    }

    public void setModelo(T modelo) {
        this.modelo = modelo;
    }
}
