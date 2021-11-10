package br.com.generation.redesocial.conecta.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.generation.redesocial.conecta.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	public List<Usuario>findAllByNomeContainingIgnoreCase(String nome);
	

	
}
