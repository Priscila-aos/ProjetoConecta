package br.com.generation.redesocial.conecta.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.generation.redesocial.conecta.model.Tema;

public interface TemaRepository extends JpaRepository<Tema, Long>{
	public List<Tema>findAllByTipoContainingIgnoreCase(String tipo);
	
	public List<Tema>findAllBySegmentoContainingIgnoreCase(String segmento);
}
