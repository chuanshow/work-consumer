package net.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.service.ConsulService;

@RestController
public class CheckApi {
	
	@Autowired ConsulService service;
	
	@GetMapping("api/checkstatus")
	public String checkstatus(@RequestParam(required=false)String name){
		return service.checkService(name);
	}
	@GetMapping("api/check")
	public boolean checkfalg(){
		return true;
	}
}
