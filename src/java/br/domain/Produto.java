package java.br.domain;

public class Produto {

    private Long id;
    private Integer preco;
    private String nome;

    public Integer getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getPreco() {
        return preco;
    }

    public void setPreco(Integer preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
