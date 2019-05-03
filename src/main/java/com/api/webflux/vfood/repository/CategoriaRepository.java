package com.api.webflux.vfood.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.api.webflux.vfood.document.Categoria;

@Repository
public interface CategoriaRepository extends ReactiveMongoRepository<Categoria, String>{

}
