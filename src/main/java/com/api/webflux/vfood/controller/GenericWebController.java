package com.api.webflux.vfood.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.api.webflux.vfood.document.Response;
import com.api.webflux.vfood.services.GenericService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public abstract class GenericWebController<T, S extends GenericService<T>>{

	protected abstract S getService();
	
//	protected abstract V getValidation();
	
	@GetMapping
	public Flux<T> getFindAll() {
		return getService().findAll();
	}

	@GetMapping(value="{id}")
	public Mono<T> getFindById(@PathVariable("id") String id) {
		return getService().findById(id);
	}
	
	@PostMapping
	public Mono<T> createOrUpdate(@RequestBody T object) {
		return getService().createOrUpdate(object);
	}
	
	@DeleteMapping(value="{id}")
	public ResponseEntity<Response<String>> delete(@PathVariable("id") String id) {
		Response<String> response = new Response<>();
		Mono<T> obj = getService().findById(id);
		if (obj == null) {
			response.getErrors().add("Register not found " + id);
			return ResponseEntity.badRequest().body(response);
		}
		getService().delete(id);
		System.out.println("aqui" + getService());
		response.setData("Object Deleted");
		return ResponseEntity.ok(response);
	}	
}
