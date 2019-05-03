package com.api.webflux.vfood.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.webflux.vfood.document.Status;
import com.api.webflux.vfood.repository.StatusRepository;
import com.api.webflux.vfood.services.StatusService;

@Service
public class StatusServiceImpl extends GenericServiceImpl<Status, StatusRepository> implements StatusService{

	@Autowired
	private StatusRepository statusRepository;

	@Override
	protected StatusRepository getRepo() {
		return this.statusRepository;
	}
}
