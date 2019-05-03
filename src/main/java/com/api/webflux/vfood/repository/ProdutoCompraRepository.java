package com.api.webflux.vfood.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.api.webflux.vfood.document.ProdutoCompra;

@Repository
public interface ProdutoCompraRepository extends ReactiveMongoRepository<ProdutoCompra, String>{

}
