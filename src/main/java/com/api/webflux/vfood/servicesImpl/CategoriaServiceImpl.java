package com.api.webflux.vfood.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.webflux.vfood.document.Categoria;
import com.api.webflux.vfood.repository.CategoriaRepository;
import com.api.webflux.vfood.services.CategoriaService;

@Service
public class CategoriaServiceImpl extends GenericServiceImpl<Categoria, CategoriaRepository> implements CategoriaService{

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Override
	protected CategoriaRepository getRepo() {
		return this.categoriaRepository;
	}

}
