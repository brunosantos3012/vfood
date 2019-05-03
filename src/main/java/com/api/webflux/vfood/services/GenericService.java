package com.api.webflux.vfood.services;

import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public interface GenericService<T> {
	
	Flux<T> findAll();
	
	Mono<T> findById(String id);
	
	Mono<T> createOrUpdate(T object);
	
	void delete(String id);
	
}
