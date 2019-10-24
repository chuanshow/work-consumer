package net.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.service.ConsulProviderService;
import net.service.ConsulService;

@Service
public class ConsulServiceImpl implements ConsulService{

	@Autowired 
	ConsulProviderService service;
	public String checkService(String name) {
		return service.checkService(name);
	}

}
