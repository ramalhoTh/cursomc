package com.ramalho.pdi.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ramalho.pdi.domain.Categoria;
import com.ramalho.pdi.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	CategoriaRepository catRepository;
	
	public Categoria buscar(Integer id) {
		
		Optional<Categoria> obj = catRepository.findById(id);  
		return obj.orElse(null); 
	}

}
