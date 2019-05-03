package com.api.webflux.vfood.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.webflux.vfood.document.Usuario;
import com.api.webflux.vfood.services.UsuarioService;

@RestController
@RequestMapping("/api/usuario")
@CrossOrigin(origins="*")
public class UsuarioWebController extends GenericWebController<Usuario, UsuarioService>{

	@Autowired
	private UsuarioService usuarioService;
	
	@Override
	protected UsuarioService getService() {
		return this.usuarioService;
	}

}
