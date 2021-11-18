package br.com.generation.redesocial.conecta.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_postagem")
public class Postagem {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@NotBlank(message = "Este campo não pode ficar vazio")
	@Size(min = 5,max = 30, message = "O titulo deve ter no mínimo 5 caracteres e no máximo 30")
	private String titulo;
	
	@NotBlank(message = "Este campo não pode ficar vazio")
	@Size(min = 5,max = 500, message = "O titulo deve ter no mínimo 5 caracteres e no máximo 500")
	private String texto;
	
	@NotBlank(message = "Este campo não pode ficar vazio")
	@Size(min = 5,max = 100, message = "O titulo deve ter no mínimo 5 caracteres e no máximo 100")
	private String imagem;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date data = new java.sql.Date(System.currentTimeMillis());
	
	@ManyToOne
	@JsonIgnoreProperties("postagem")
	@JoinColumn(name = "fk_idtema")
	private Tema tema;
	
	@ManyToOne
	@JsonIgnoreProperties("postagem")
	@JoinColumn(name = "fk_idusuario")
	private Usuario usuario;
	
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
}