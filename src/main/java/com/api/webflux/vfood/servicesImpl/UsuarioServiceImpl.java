package com.api.webflux.vfood.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.webflux.vfood.document.Usuario;
import com.api.webflux.vfood.repository.UsuarioRepository;
import com.api.webflux.vfood.services.UsuarioService;

@Service
public class UsuarioServiceImpl extends GenericServiceImpl<Usuario, UsuarioRepository> implements UsuarioService{

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	protected UsuarioRepository getRepo() {
		return this.usuarioRepository;
	}
}
