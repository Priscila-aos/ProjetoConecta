package br.com.generation.redesocial.conecta.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_usuarios")
public class Usuario {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;

@NotBlank(message = "Este campo não pode ficar vazio")
@Size(min = 5,max = 80, message = "O nome deve ter no min 5 e no max 80 caracteres.")
private String nome;

@NotBlank(message = "Este campo não pode ficar em branco e pode ter no max 80 caracteres.")
@Size(min = 5,max = 80, message = "O email deve ter no min 5 e no max 80 caracteres.")
private String email;

@NotBlank(message = "A senha deve conter pelo menos uma letra, ter no max 80 caracteres.")
@Size(min = 5,max = 80, message = "Asenha deve ter no min 5 e no max 80 caracteres.")
private String senha;

@OneToMany(mappedBy = "usuarios", cascade = CascadeType.ALL)
@JsonIgnoreProperties("usuarios")
private List<Postagem> postagem;

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getSenha() {
	return senha;
}

public void setSenha(String senha) {
	this.senha = senha;
}

public List<Postagem> getPostagem() {
	return postagem;
}

public void setPostagem(List<Postagem> postagem) {
	this.postagem = postagem;
}



}
