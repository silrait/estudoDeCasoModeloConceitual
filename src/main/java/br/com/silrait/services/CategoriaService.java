package br.com.silrait.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.silrait.domain.Categoria;
import br.com.silrait.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> optional = repo.findById(id);
		
		return optional.orElse(null);
	}
}
