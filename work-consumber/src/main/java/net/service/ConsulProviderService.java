package net.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="myservice")
public interface ConsulProviderService {
	
	@GetMapping("/user/login/check")
	public String checkService(@RequestParam(name="name") String name);
}
