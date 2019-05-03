package com.api.webflux.vfood.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.webflux.vfood.document.Restaurante;
import com.api.webflux.vfood.repository.RestauranteRepository;
import com.api.webflux.vfood.services.RestauranteService;

@Service
public class RestauranteServiceImpl extends GenericServiceImpl<Restaurante, RestauranteRepository> implements RestauranteService{

	@Autowired
	private RestauranteRepository restauranteRepository;

	@Override
	protected RestauranteRepository getRepo() {
		return this.restauranteRepository;
	}
}
