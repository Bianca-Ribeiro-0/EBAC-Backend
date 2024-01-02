/**
 * 
 */
package main.java.br.com.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "TB_MARCA")
public class Marca {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="marca_seq")
	@SequenceGenerator(name="marca_seq", sequenceName="sq_marca", initialValue = 1, allocationSize = 1)
	private Long id;
	
	@Column(name = "CODIGO", length = 10, nullable = false, unique = true)
	private String codigo;
	
	@Column(name = "DESCRICAO", length = 50, nullable = false)
	private String descricao;
	
	@OneToMany(mappedBy = "marca")
	private List<Carro> carro;
	
	public Marca() {
		this.carro = new ArrayList<>();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Carro> getCarro() {
		return carro;
	}

	public void setAlunos(List<Carro> carro) {
		this.carro = carro;
	}
	
	public void add(Carro carro) {
		this.carro.add(carro);
	}
	
}
