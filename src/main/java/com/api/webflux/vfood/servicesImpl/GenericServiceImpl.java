package com.api.webflux.vfood.servicesImpl;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Service;

import com.api.webflux.vfood.services.GenericService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public abstract class GenericServiceImpl<T, S extends ReactiveMongoRepository<T, String>> implements GenericService<T>{
	
	protected abstract S getRepo();

	@Override
	public Flux<T> findAll() {
		return this.getRepo().findAll();
	}

	@Override
	public Mono<T> findById(String id) {
		return this.getRepo().findById(id);
	}

	@Override
	public Mono<T> createOrUpdate(T object) {
		return this.getRepo().save(object);
	}

	@Override
	public void delete(String id) {
		this.getRepo().deleteById(id);
	}
 
}
