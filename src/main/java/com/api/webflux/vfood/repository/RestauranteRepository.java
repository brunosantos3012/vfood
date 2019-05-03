package com.api.webflux.vfood.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.api.webflux.vfood.document.Restaurante;

@Repository
public interface RestauranteRepository extends ReactiveMongoRepository<Restaurante, String>{

}
