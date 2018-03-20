package com.drzk.cloudplatform.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.drzk.cloudplatform.service.servieinterface.TestInterface;

@RestController
@RequestMapping(value = "/test")
public class TestController {

	@Autowired
	TestInterface testInterface;
	
/*	@GetMapping(value = "/list")
	public Map<String, Object> getByList() {
		//User testBean = new User();
		Map<String, Object> map = new HashMap<>();
		map.put("result", testInterface.getLists());
		return map;
	}
	
	@GetMapping(value = "/getById")
	public Map<String, Object> getById(@RequestParam(value = "Id") String Id) {
		Map<String, Object> map = new HashMap<>();
		map.put("result", testInterface.getById(Id));
		return map;
	}
*/
	@GetMapping(value = "/list")
	public Object getByList() {
		return testInterface.getLists();
	}
	
	@GetMapping(value = "/getById")
	public Map<String, Object> getById(@RequestParam(value = "Id") String Id) {
		Map<String, Object> map = new HashMap<>();
		map.put("result", testInterface.getById(Id));
		return map;
	}
	
}
