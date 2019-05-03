package com.api.webflux.vfood.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.api.webflux.vfood.document.Perfil;

@Repository
public interface PerfilRepository extends ReactiveMongoRepository<Perfil, String>{

}
