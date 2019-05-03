package com.api.webflux.vfood.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.webflux.vfood.document.Perfil;
import com.api.webflux.vfood.repository.PerfilRepository;
import com.api.webflux.vfood.services.PerfilService;

@Service
public class PerfilServiceImpl extends GenericServiceImpl<Perfil, PerfilRepository> implements PerfilService{

	@Autowired
	private PerfilRepository perfilRepository;

	@Override
	protected PerfilRepository getRepo() {
		return this.perfilRepository;
	}
}
