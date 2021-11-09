package br.com.generation.redesocial.conecta.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_tema")
public class Tema {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank(message = "Este campo não pode ficar em branco e pode ter no max 100 caracteres")
	@Size(min =1,max = 100)
	private String tipo;
	
	@NotBlank(message = "Este campo não pode ficar em branco e pode ter no max 100 caracteres")
	@Size(min =1,max = 100)
	private String descricao;
	
	@NotBlank(message = "Este campo não pode ficar em branco e pode ter no max 100 caracteres")
	@Size(min =1,max = 100)
	private String segmento;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getSegmento() {
		return segmento;
	}

	public void setSegmento(String segmento) {
		this.segmento = segmento;
	}

}
