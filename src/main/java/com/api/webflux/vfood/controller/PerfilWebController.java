package com.api.webflux.vfood.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.webflux.vfood.document.Perfil;
import com.api.webflux.vfood.services.PerfilService;

@RestController
@RequestMapping("/api/perfil")
@CrossOrigin(origins="*")
public class PerfilWebController extends GenericWebController<Perfil, PerfilService>{

	@Autowired
	private PerfilService perfilService;
	
	@Override
	protected PerfilService getService() {
		return this.perfilService;
	}

}
