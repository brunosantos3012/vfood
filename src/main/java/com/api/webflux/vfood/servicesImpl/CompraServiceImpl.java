package com.api.webflux.vfood.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.webflux.vfood.document.Compra;
import com.api.webflux.vfood.repository.CompraRepository;
import com.api.webflux.vfood.services.CompraService;

@Service
public class CompraServiceImpl extends GenericServiceImpl<Compra, CompraRepository> implements CompraService{

	@Autowired
	private CompraRepository compraRepository;
	
	@Override
	protected CompraRepository getRepo() {
		return this.compraRepository;
	}

}
