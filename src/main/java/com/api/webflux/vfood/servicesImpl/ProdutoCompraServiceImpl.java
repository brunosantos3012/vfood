package com.api.webflux.vfood.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.webflux.vfood.document.ProdutoCompra;
import com.api.webflux.vfood.repository.ProdutoCompraRepository;
import com.api.webflux.vfood.services.ProdutoCompraService;

@Service
public class ProdutoCompraServiceImpl extends GenericServiceImpl<ProdutoCompra, ProdutoCompraRepository> implements ProdutoCompraService{

	@Autowired
	private ProdutoCompraRepository produtoCompraRepository;
	
	@Override
	protected ProdutoCompraRepository getRepo() {
		return this.produtoCompraRepository;
	}

}
