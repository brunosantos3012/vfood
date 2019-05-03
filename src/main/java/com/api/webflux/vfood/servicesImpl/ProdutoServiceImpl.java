package com.api.webflux.vfood.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.webflux.vfood.document.Produto;
import com.api.webflux.vfood.repository.ProdutoRepository;
import com.api.webflux.vfood.services.ProdutoService;

@Service
public class ProdutoServiceImpl extends GenericServiceImpl<Produto, ProdutoRepository> implements ProdutoService{

	@Autowired
	private ProdutoRepository produtoRepository;

	@Override
	protected ProdutoRepository getRepo() {
		return this.produtoRepository;
	}
}
