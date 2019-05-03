package com.api.webflux.vfood.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.api.webflux.vfood.document.Usuario;

@Repository
public interface UsuarioRepository extends ReactiveMongoRepository<Usuario, String>{

}
