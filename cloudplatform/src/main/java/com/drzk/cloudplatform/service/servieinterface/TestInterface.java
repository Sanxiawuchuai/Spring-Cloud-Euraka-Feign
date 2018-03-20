package com.drzk.cloudplatform.service.servieinterface;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("drzk-cloud-platform-provider")
public interface TestInterface {

	@RequestMapping(value = "/drzk/user/get")
	public Object getById(@RequestParam(value = "Id") String Id);
	
	@RequestMapping(value = "/drzk/user/list")
	public Object getLists();
	
}
